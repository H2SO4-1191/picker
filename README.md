# Picker

A lightweight, intuitive Android application built in Kotlin to help users make quick, randomized decisions from custom item lists.

## Overview

**Picker** is a utility application designed to eliminate decision fatigue. Built natively for Android using Kotlin and XML layouts, the application allows users to input a custom collection of options (such as restaurants, tasks, or activities) and utilizes a randomized selection engine to pick a single choice instantly. It features a clean user interface and responsive input handling for seamless everyday use.

## Features

- **Custom List Creation:** Easily add, manage, and view a dynamic collection of custom items or choices.
- **Randomized Selection Engine:** Executes a clean, unbiased randomization algorithm to instantly select a single choice from the active pool.
- **Clean XML UI Architecture:** Utilizes native Android XML layouts to ensure smooth component transitions and optimal performance across different screen aspect ratios.
- **Responsive View States:** Implements input validation to ensure the selection engine only runs when sufficient options are provided.

## Tech Stack

- **Language:** Kotlin
- **UI Framework:** Android XML Layouts / View Binding
- **Build System:** Gradle (Kotlin DSL - `.gradle.kts`)
- **Target Platform:** Android (Native API)

## Project Structure

```bash
picker/
├── app/                      # Main application module (source code, layouts, manifests)
│   ├── src/main/java/        # Core Kotlin source files and decision logic
│   └── src/main/res/         # XML UI layouts, drawables, and value definitions
├── .gitignore                # Active ignore rules filtering IDE and build caches
├── build.gradle.kts          # Top-level build configuration script
├── gradle.properties         # Project-wide Gradle configuration variables
├── gradlew                   # Linux/macOS Gradle wrapper execution script
├── gradlew.bat               # Windows Gradle wrapper execution batch file
└── settings.gradle.kts       # Sub-project and repository initialization definitions
```

## Setup & Execution

### Prerequisites

- Android Studio (Ladybug or higher recommended)
- Android SDK configured with target API requirements

### Installation

- Clone the repository directory structure locally:

  ```bash
  git clone https://github.com
  ```

- Open **Android Studio** and choose **File > Open**, then select the cloned `picker/` root directory.

- Let Gradle sync completely to download project-level dependencies and build structural configurations.

- Connect a physical Android test device (via USB Debugging) or launch an active Virtual Device Emulator instance.

- Click the **Run** button (`Shift + F10`) or execute the Gradle wrapper via the terminal to deploy:
  ```bash
  ./gradlew installDebug
  ```

## Author

H2SO4-1191 – Software Engineer
