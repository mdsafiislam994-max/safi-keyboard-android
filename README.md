# Safi Keyboard
Premium Bengali + English Android IME starter project inspired by the supplied reference image.

## Included in this starter
- Multi-color themes and keyboard sizing control
- English QWERTY and a basic Bengali character layout
- Starter transliteration (not the full Avro Phonetic engine)
- Local user shortcuts such as KL → খুলনা
- Small demo correction set (not a full Bengali/English dictionary or language model)
- Emoji panel, clipboard history, voice-recognition hand-off, Translate hand-off, and GIF website shortcut
- GitHub Actions workflow to build a debug APK

## Build
Open Actions → Build Safi Keyboard APK → Run workflow. Download the safi-keyboard-debug-apk artifact from a successful run.

## Feature limitations
This is not yet a production-ready Avro/Gboard replacement. Full Avro parity, comprehensive offline dictionaries, contextual auto-correction, in-keyboard translation result insertion, and native GIF provider integration require additional implementation and testing. Voice input depends on the device's installed speech recognition provider and may send audio to that provider.

## Privacy
No network permission or keystroke analytics are declared. Clipboard is read only when the clipboard panel is opened. External translation and speech features are explicit user-triggered hand-offs.