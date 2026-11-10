# iOS build validation

The port is validated in independent stages:

1. Kotlin Multiplatform: compile the iOS Simulator target and resolve all Native dependencies.
2. Xcode host: integrate the generated Compose framework into a minimal SwiftUI host and build for an iOS Simulator.
3. Runtime smoke test: launch the app and verify startup, navigation, networking, and persistence.
4. Native playback: implement and test AVPlayer, queue control, background audio, Now Playing, and remote commands.
5. Release: archive, sign, and export an IPA.

A successful earlier stage does not imply later stages are complete. Platform-specific dependencies must remain in the matching source sets; Android/JVM-only libraries must not be declared in commonMain.
