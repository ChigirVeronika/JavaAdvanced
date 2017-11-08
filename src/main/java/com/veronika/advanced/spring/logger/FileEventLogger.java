package com.veronika.advanced.spring.logger;

import com.veronika.advanced.spring.bean.Event;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class FileEventLogger implements EventLogger {

    private File file;
    private String filename;

    public FileEventLogger(String filename) {
        this.filename = filename;
    }

    public void init() {
        file = new File(filename);
        if (file.exists() && !file.canWrite()) {
            throw new IllegalArgumentException("Can't write to file " + filename);
        } else if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (Exception e) {
                throw new IllegalArgumentException("Can't create file", e);
            }

        }
    }

    public void logEvent(Event event) {
        try {
            FileUtils.writeStringToFile(file, event.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
