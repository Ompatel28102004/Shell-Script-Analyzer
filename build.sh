#!/bin/bash

# Determine the classpath separator based on the operating system
if [[ "$OSTYPE" == "msys" || "$OSTYPE" == "cygwin" || "$OSTYPE" == "win32" ]]; then
    CP_SEP=";"
else
    CP_SEP=":"
fi

echo "Step 1: Creating 'lib' directory..."
mkdir -p lib
echo "'lib' directory ready."

echo
echo "Step 2: Downloading ANTLR jar..."
curl -o lib/antlr-4.13.1-complete.jar https://www.antlr.org/download/antlr-4.13.1-complete.jar
echo "ANTLR jar downloaded."

echo
echo "Step 3: Generating parser and visitor from ShellScript.g4..."
mkdir -p build
java -cp "lib/antlr-4.13.1-complete.jar" org.antlr.v4.Tool -visitor -o build ShellScript.g4
echo "Parser and visitor generated."

echo
echo "Step 4: Compiling Java files..."
javac -cp "lib/antlr-4.13.1-complete.jar${CP_SEP}build" -d build build/*.java ShellScriptAnalyzer.java ShellScriptErrorListener.java
echo "Compilation successful."

echo
echo "Step 5: Running analyzer on test-ok.sh"
echo "----------------------------------------"
java -cp "build${CP_SEP}lib/antlr-4.13.1-complete.jar" ShellScriptAnalyzer test-ok.sh
echo "test-ok.sh executed."
echo

echo "Step 6: Running analyzer on test-error.sh"
echo "-------------------------------------------"
java -cp "build${CP_SEP}lib/antlr-4.13.1-complete.jar" ShellScriptAnalyzer test-error.sh
echo "test-error.sh executed."

echo
echo "All steps completed."