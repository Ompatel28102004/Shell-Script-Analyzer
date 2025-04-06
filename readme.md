# 🐚 Shell Script Analyzer

A simple static analyzer for a custom shell-like scripting language using **ANTLR 4** and **Java**. It parses basic shell programming constructs and provides **detailed syntax error messages** with suggestions.

---

## ✅ Supported Shell Features

This tool supports the following core constructs of shell scripting:

### ✅ Statements
- `echo "text"` or `echo $variable`
- Variable assignment: `x=1`
- Arithmetic: `x=$((x + 1))`

### ✅ Conditionals
```sh
if [ $x -lt $y ]
then
    ...
else
    ...
fi
```

### ✅ Loops
#### For Loop:
```sh
for i in one two three
do
    echo $i
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

---

## 🚫 What’s NOT Supported
- File operations (`cat`, `touch`, etc.)
- Command substitution like `` `command` ``
- Piping (`|`), redirection (`>`, `<`)
- Function definitions
- Advanced command-line flags

---

## 🧠 Errors Handled by the Analyzer

The analyzer detects and gives suggestions for common syntax issues:

| Error Type                | Example                              | Suggestion                                      |
|--------------------------|--------------------------------------|-------------------------------------------------|
| Missing `then`           | `if [ $x -lt $y ]`                   | Did you forget to write `'then'` after `if`?   |
| Missing `fi`             | `if ... then ...`                    | Make sure your `if` ends with `'fi'`.          |
| Missing `do`             | `for i in ...`                       | Did you forget `'do'` after the loop header?   |
| Missing `done`           | `while ... do ...`                   | Loops must end with `'done'`.                  |
| Invalid variable syntax  | `x` instead of `$x`                  | Variables must start with `'$'`.               |
| Missing brackets         | `if $x -lt $y`                       | Use brackets: `[ $x -lt $y ]`.                 |
| Arithmetic issues        | `x=($x + 1)`                         | Use correct syntax: `x=$((x + 1))`             |
| Unexpected tokens        | Typing errors or unsupported chars   | General suggestion to review syntax            |

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
    javac -cp "lib/antlr-4.13.1-complete.jar;build" -d build build/*.java ShellScriptAnalyzer.java ShellScriptErrorListener.java
    ```

5. **Run the analyzer**
    ```bash
    java -cp "build;lib/antlr-4.13.1-complete.jar" ShellScriptAnalyzer test.sh
    ```
    
## 📝 Example

### ✅ Valid Script (`test-ok.sh`)
```sh
x=1
y=5

if [ $x -lt $y ]
then
    echo "x is less than y"
else
    echo "x is not less than y"
fi

for i in one two three
do
    echo $i
done

while [ $x -lt 3 ]
do
    echo $x
    x=$((x + 1))
done
```

### ❌ Invalid Script (`test-error.sh`)
```sh
x=1
y=5

if $x -lt $y
then
    echo "x is less"
else
    echo "x is not less"
fi
```

This would output:
```
Syntax error at line 4:3 - missing '[' at '$'
Suggestion: The condition in if/while must be inside square brackets '[ condition ]'.
```

---

## 📁 File Structure

```
.
├── ShellScript.g4
├── ShellScriptAnalyzer.java
├── ShellScriptErrorListener.java
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
