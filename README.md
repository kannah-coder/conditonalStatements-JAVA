# conditonalStatements-JAVA

# 🔄 Java `switch` Statement — Complete Explanation

The **`switch` statement** in Java is a powerful decision-making structure used when a variable or expression needs to be compared against **multiple fixed values**.  
It helps simplify long chains of `if-else-if` statements and makes the code more readable and efficient.

---

## 🧠 What is a `switch` Statement?

The `switch` statement tests the value of a variable or expression and **transfers control** to one of several blocks of code depending on which case matches.

It is mainly used when:
- You have **one variable** with **multiple constant options**.
- Each option leads to a **different action**.

---

## ⚙️ How `switch` Works

1. The expression inside `switch(expression)` is evaluated **once**.  
2. Its result is compared with each `case` value.  
3. When a match is found, the statements under that case are executed.  
4. The `break` statement is used to stop the flow and prevent **fall-through**.  
5. If no case matches, the `default` block (if present) runs.

---

## 🧩 Key Components

| Component | Description |
|------------|--------------|
| `switch(expression)` | The variable or expression to evaluate. |
| `case` | Defines a possible constant value to match against. |
| `break` | Stops the execution from continuing into the next case. |
| `default` | Executes if no case value matches (optional but recommended). |

---

## 📘 Rules for Using `switch`

1. **Expression Type:**  
   The `switch` expression must evaluate to one of these types:  
   - `byte`, `short`, `int`, `char`  
   - `enum` type  
   - `String` (Java 7+)  
   - Wrapper classes of these types (`Byte`, `Integer`, etc.)

2. **Unique Case Values:**  
   - Each `case` must have a unique constant value.  
   - Duplicate case values are not allowed.

3. **Use of `break`:**  
   - `break` stops further case checking and exits the `switch`.  
   - Without `break`, control **falls through** to the next case.

4. **Default Case:**  
   - Optional but useful to handle unexpected or invalid values.

---

## 🧱 Types of `switch` Statements

### 🔹 1️⃣ Traditional `switch` (Classic Style)
- Used for integers, characters, or strings.
- Requires `break` after each case.
- Has an optional `default` block.

### 🔹 2️⃣ Nested `switch`
- A `switch` statement inside another `switch`.
- Useful for multi-level categorized decisions (e.g., department + year).

### 🔹 3️⃣ String-based `switch` (Java 7+)
- Allows using `String` values in cases.
- Internally uses string hashing for comparison.

### 🔹 4️⃣ Modern `switch` Expression (Java 14+)
- Cleaner syntax using `->` arrow labels.
- Can **return values** directly.
- Does **not require `break`**.
- Can combine multiple case labels (e.g., `case "Jan", "Feb", "Mar" -> ...`).

---
 


## 📁 Folder Structure

📂 switches/
┣ 📜 s1.java → Basic and String switch examples
┣ 📜 s2.java → Modern switch expression and multiple labels
┣ 📜 nes_switch.java → Nested switch examples
┗ 📜 README.md → Documentation file (this one)



---

## 🧠 Overview

Conditional statements in Java allow decision-making in code.

There are **two main types**:
1. **If–Else Ladder**
2. **Switch Statements** (Traditional + Modern)

---

 

 
