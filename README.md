# History Page

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Android](https://img.shields.io/badge/Android-5.0+-green.svg)](https://developer.android.com)
[![Kotlin](https://img.shields.io/badge/Kotlin-1.5+-blue.svg)](https://kotlinlang.org)

An engaging Android application that brings history to life through interactive pages, stunning visuals, and educational content about historical figures, places, and events.

## Features

- **Interactive Historical Pages**: Explore dedicated pages for various historical topics including:

  - Fajar's Page
  - Javas's Page
  - Mufid's Page
  - Rifqi's Page
  - Zidan's Page
  - Additional historical sections

- **Rich Visual Content**: High-quality images, illustrations, and themed backgrounds
- **Smooth Navigation**: Intuitive navigation between sections with animated transitions
- **Responsive Design**: Optimized for different screen sizes and orientations
- **Educational Content**: Informative text and descriptions for each historical topic

## Screenshots

Coming soon - Add screenshots of the app in action

## Installation

### Prerequisites

- [Android Studio](https://developer.android.com/studio) (Arctic Fox or later)
- JDK 8 or higher
- Android SDK API 21+ (Android 5.0 Lollipop)

### Steps

1. **Clone the repository**:

   ```bash
   git clone https://github.com/Jars44/history-place.git
   cd history-place
   ```

2. **Open in Android Studio**:

   - Launch Android Studio
   - Select "Open an existing Android Studio project"
   - Navigate to the cloned directory and select it

3. **Sync Project**:

   - Android Studio will automatically sync the project with Gradle
   - Wait for the sync to complete

4. **Build and Run**:
   - Connect an Android device or start an emulator
   - Click the "Run" button (green play icon) in Android Studio

## Requirements

- **Minimum Android Version**: API 21 (Android 5.0 Lollipop)
- **Target Android Version**: API 34 (Android 14)
- **Kotlin Version**: 1.5+
- **Gradle Version**: 7.0+

## Usage

1. Launch the History Page app on your Android device
2. Browse through different historical sections using the navigation buttons
3. Tap on images and text to explore detailed information
4. Use the next/previous buttons to navigate between pages
5. Enjoy learning about various historical topics interactively

## Project Structure

```bash
history-place/
├── app/
│   ├── build.gradle.kts          # App-level build configuration
│   └── src/main/
│       ├── AndroidManifest.xml   # App manifest
│       ├── java/com/example/history_page/
│       │   ├── MainActivity.kt   # Main activity
│       │   ├── FirstBuildActivity.java
│       │   ├── Secondactivity.java
│       │   └── ...               # Other activities
│       └── res/
│           ├── drawable/         # Images and icons
│           ├── layout/           # XML layout files
│           ├── values/           # Strings, colors, themes
│           └── ...
├── gradle/
│   └── wrapper/                  # Gradle wrapper
├── build.gradle.kts              # Project-level build
└── settings.gradle.kts           # Project settings
```

## Technologies Used

- **Language**: Kotlin & Java
- **Framework**: Android SDK
- **Build Tool**: Gradle
- **Architecture**: MVVM (Model-View-ViewModel)
- **UI**: XML Layouts with ConstraintLayout
- **Version Control**: Git

## Contributing

We welcome contributions! Please follow these steps:

1. Fork the repository
2. Create a feature branch: `git checkout -b feature/amazing-feature`
3. Commit your changes: `git commit -m 'Add amazing feature'`
4. Push to the branch: `git push origin feature/amazing-feature`
5. Open a Pull Request

### Guidelines

- Follow Kotlin coding standards
- Add tests for new features
- Update documentation as needed
- Ensure compatibility with minimum API level

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
