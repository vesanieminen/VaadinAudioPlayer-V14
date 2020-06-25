package org.vaadin.addon.audio.demo;

import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.vaadin.addon.audio.server.AudioPlayer;
import org.vaadin.addon.audio.server.Encoder;
import org.vaadin.addon.audio.server.Stream;
import org.vaadin.addon.audio.server.encoders.MP3Encoder;
import org.vaadin.addon.audio.server.encoders.OGGEncoder;
import org.vaadin.addon.audio.server.encoders.WaveEncoder;
import org.vaadin.addon.audio.server.util.FeatureSupport;
import org.vaadin.addon.audio.server.util.ULawUtil;
import org.vaadin.addon.audio.server.util.WaveUtil;
import org.vaadin.addon.audio.shared.ChunkDescriptor;
import org.vaadin.addon.audio.shared.PCMFormat;
import org.vaadin.addon.audio.shared.util.Log;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * The main view contains a button and a click listener.
 */
@Route("")
public class DemoUIFlow extends VerticalLayout {

    public static final String TEST_FILE_PATH = "src/main/resources/org/vaadin/addon/audio/wav";

    public DemoUIFlow() {
        Span span = new Span("hi!");
    }

}
