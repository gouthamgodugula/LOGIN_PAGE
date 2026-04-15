# LOGIN_PAGE
# 🔐 JavaFX Login Page

A simple and beginner-friendly login page built using JavaFX.
This project demonstrates basic UI creation and event handling in JavaFX.

---

## 📌 Features

* Username and Password input fields
* Login button
* Simple validation (hardcoded credentials)
* Success / Error message display
* Clean and minimal UI

---

## 🛠️ Technologies Used

* Java
* JavaFX
* Eclipse IDE

---
---

## ▶️ How to Run

### 1. Install JavaFX

* Download JavaFX SDK from: https://openjfx.io
* Extract it to a folder (example: `C:\javafx`)

---

### 2. Add JavaFX to Eclipse

* Right-click project → **Properties**
* Go to **Java Build Path**
* Click **Libraries → Add External JARs**
* Select all `.jar` files from:

  ```
  javafx/lib
  ```

---

### 3. Set VM Arguments

Go to:

```
Run → Run Configurations → Arguments
```

Add this in **VM arguments**:

```
--module-path "C:\javafx\lib" --add-modules javafx.controls,javafx.fxml
```

---

### 4. Run the Program

* Click **Run ▶️**
* The login window will open

---

## 🔑 Default Login Credentials

| Username | Password |
| -------- | -------- |
| admin    | 1234     |

---

## 📸 Output

* Enter correct credentials → ✅ Login Successful
* Enter wrong credentials → ❌ Invalid Username or Password

---

## 🧠 Learning Concepts

* JavaFX Application structure
* UI controls (Label, TextField, Button)
* Layout (VBox)
* Event handling (`setOnAction`)
* Basic validation logic

---


## 👨‍💻 Author

*GODUGULA GOUTHAM

---
This project is for educational purposes.
