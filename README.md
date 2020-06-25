# AudioPlayer Add-on for Vaadin

This is a work in progress.

AudioPlayer is an add-on for Vaadin that, when complete, uses WebAudio to allow streaming playback of an arbitrary server-side PCM data buffer. Audio can be transported as OGG, MP3 or WAV. It also supports server-side control of the audio playback such as audio and stereo balance, as well as advanced control via pluggable effects, such as high- and lowpass filters.

## Development instructions

Starting the test/demo server:
```
mvn jetty:run
```

This deploys demo at http://localhost:8080


