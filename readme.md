## 🐚 Shell Script Analyzer

A simple static analyzer for a custom shell-like scripting language using **ANTLR 4** and **Java**. It parses a wide range of shell programming constructs and provides **detailed syntax error messages** with suggestions.

---

## ✅ Supported Shell Features

This tool supports the following core constructs of shell scripting:

### ✅ Statements

- Simple commands: `ls -l`, `echo "hello" $var 42`
- Variable assignment: `x=5`, `x="text"`, `x=$y`
- Array assignment: `fruits=("apple" "banana" "cherry")`
- Arithmetic expansion: `x=$((x + 1))`
- Empty statements: `;`

### ✅ Pipelines

```sh
ls | grep txt
ls -l | sort | uniq
```

### ✅ Conditionals

```sh
if [ $x -eq 0 ]
then
    echo "Zero"
elif [ $x -lt 0 ]
then
    echo "Negative"
else
    echo "Positive"
fi
```

### ✅ Loops

#### For Loop:

```sh
for i in one two three
do
    echo $i
done
for fruit in "${fruits[@]}"
do
    echo $fruit
done
```

#### While Loop:

```sh
while [ $x -lt 3 ]
do
    echo $x
    x=$((x + 1))
done
```

### ✅ Function Definitions

```sh
function myfunc() {
    echo "Hello, $1"
}
```

### ✅ Redirections

```sh
echo "Log" > file.txt
cat input.txt > output.txt
echo "Append" >> log.txt
```

---

## 🚫 What’s NOT Supported

- Command substitution: `` `command` `` or `$(command)`
- Advanced arithmetic operations (e.g., floating-point)
- Associative arrays
- Signal handling (e.g., `trap`)
- Here-documents (`<<`)
- Complex parameter expansions (e.g., `${var:-default}`)

---

## 🧠 Errors Handled by the Analyzer

The analyzer detects and gives suggestions for common syntax issues:

| Error Type | Example | Suggestion |
| --- | --- | --- |
| Missing `then` | `if [ $x -eq 0 ]` | Did you forget to write `'then'` after `if`? |
| Missing `fi` | `if ... then ...` | Make sure your `if` ends with `'fi'`. |
| Missing `do` | `for i in ...` | Did you forget `'do'` after the loop header? |
| Missing `done` | `while ... do ...` | Loops must end with `'done'`. |
| Invalid variable syntax | `x` instead of `$x` | Variables must start with `'$'`. |
| Missing brackets | `if $x -eq 0` | Use brackets: `[ $x -eq 0 ]`. |
| Arithmetic issues | `x=(x + 1)` | Use correct syntax: `x=$((x + 1))`. |
| Unexpected tokens | Typing errors or unsupported chars | General suggestion to review syntax. |

---

## 🚀 Setup Instructions

### 📦 Prerequisites

- **Java (JDK 8+)**
- **curl** (to download ANTLR)
- (Optional) Any text editor or IDE

---

## 🚀 Quick Run (One Command)

```bash
chmod +x build.sh
./build.sh
```

> **Note**: The `build.sh` script is cross-platform, automatically adjusting the classpath separator (`;` for Windows, `:` for Linux/macOS).

---

### 🔧 Steps to Set Up & Run

1. **Create directory for libraries**

   ```bash
   mkdir lib
   ```

2. **Download ANTLR JAR**

   ```bash
   curl -o lib/antlr-4.13.1-complete.jar https://www.antlr.org/download/antlr-4.13.1-complete.jar
   ```

3. **Generate parser and lexer from grammar**

   ```bash
   java -cp "lib/antlr-4.13.1-complete.jar" org.antlr.v4.Tool -visitor -o build ShellScript.g4
   ```

4. **Compile Java files**

   ```bash
   javac -cp "lib/antlr-4.13.1-complete.jar:build" -d build build/*.java ShellScriptAnalyzer.java ShellScriptErrorListener.java
   ```

   > Use `;` instead of `:` on Windows.

5. **Run the analyzer**

   ```bash
   java -cp "build:lib/antlr-4.13.1-complete.jar" ShellScriptAnalyzer test.sh
   ```

   > Use `;` instead of `:` on Windows.

## 📝 Example

### ✅ Valid Script (`test-ok.sh`)

```sh
#!/bin/bash
x=5
fruits=("apple" "banana" "cherry")

if [ $x -eq 0 ]
then
    echo "Zero"
elif [ $x -lt 0 ]
then
    echo "Negative"
else
    echo "Positive"
fi

for fruit in "${fruits[@]}"
do
    echo $fruit
done

function greet() {
    echo "Hello, $1"
}

greet "World" > output.txt
ls | grep txt >> output.txt
```

### ❌ Invalid Script (`test-error.sh`)

```sh
#!/bin/bash
x=5

if [ $x -eq 0 ]
    echo "Zero"
else
    echo "Non-zero"
fi
```

This would output:

```
Syntax error at line 4:4 - missing 'then' at 'echo'
Suggestion: Did you forget to write 'then' after your if condition?
```

---

## 📁 File Structure

```
.
├── ShellScript.g4
├── ShellScriptAnalyzer.java
├── ShellScriptErrorListener.java
├── build.sh
├── lib/
│   └── antlr-4.13.1-complete.jar
├── build/
│   └── (generated classes)
├── test-ok.sh
├── test-error.sh
└── README.md
```

## 🧹 Clean Up (Optional)

```bash
rm -rf build lib
rm -f *.class *.bak
```

---
