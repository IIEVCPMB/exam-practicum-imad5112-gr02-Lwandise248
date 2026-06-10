[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/3HAo3iZi)
# Campsite Commander 🏕️

## Overview
Campsite Commander is an Android application that allows users to organise and manage their camping gear. The app displays a packing list with item details including descriptions, quantities, and comments, helping campers keep track of everything they need.

---

## Features
- **Splash Screen** — Welcome screen with app name and description
- **Input Screen** — Add gear items via a dialog prompt
- **Display Screen** — View all packed items with full details and total count

---

## Screens

### 1. Splash Screen
- Displays the app name and subtitle
- Contains a **START** button to navigate to the input screen

### 2. Main Screen (Input)
- Contains an **Add Gear** button that opens a dialog to enter item names
- Contains a **Continue** button to navigate to the display screen

### 3. Display Screen
- Shows all packing list items with:
  - Item name
  - Description
  - Quantity
  - Comments
- Shows the **total number of items packed**
- Contains a **Back to main screen** button to return to the splash screen

---

## Tech Stack
- **Language:** Kotlin
- **Platform:** Android
- **Minimum SDK:** 24 (Android 7.0)
- **Target SDK:** 36
- **Build Tool:** Gradle with Android Gradle Plugin 9.0.1
- **UI:** XML Layouts with ConstraintLayout
- **Architecture:** Multiple Activities with Intent navigation

---

## Project Structure
```
app/
├── src/main/
│   ├── java/com/example/exampracticum/
│   │   ├── SplashActivity.kt
│   │   ├── MainActivity.kt
│   │   └── Display.kt
│   ├── res/
│   │   ├── layout/
│   │   │   ├── activity_splash.xml
│   │   │   ├── activity_main.xml
│   │   │   └── activity_display.xml
│   └── AndroidManifest.xml
```

---

## How to Run
1. Clone or download the project
2. Open in **Android Studio**
3. Let Gradle sync complete
4. Run on an emulator or physical device (Android 7.0 or higher)

---

## Developer
- **Name:** Lwandise
- **Student Number:** ST10487940
- **Module:** IMAD5112
- **Group:** GR02
