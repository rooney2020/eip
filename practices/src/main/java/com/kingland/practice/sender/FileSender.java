/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.practice.sender;

import com.kingland.practice.buffer.BaseBuffer;
import com.kingland.practice.utils.BusinessException;
import com.kingland.practice.utils.Common;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author KSC
 * @description This extends BaseSender to send data into files
 */
public class FileSender<T> extends BaseSender {
    /**
     * the designation of sending
     */
    private final String designation;

    /**
     * Constructor
     *
     * @param buffer set the source buffer
     */
    public FileSender(BaseBuffer<T> buffer, String designation) {
        super(buffer);
        this.designation = designation;
        File file = new File(Common.FILE_PATH + designation);
        if (file.exists()) {
            file.delete();
        }
    }

    /**
     * send the data which is got from buffer
     *
     * @param o element to send
     */
    @Override
    public void send(Object o) {
        if (null == designation || designation.isEmpty()) {
            throw new BusinessException(Common.PARAMETER_EXCEPTION);
        }
        try {
            File file = new File(Common.FILE_PATH + designation);
            FileWriter fileWriter = new FileWriter(file, true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(o.toString());
            printWriter.flush();
            try {
                fileWriter.flush();
                printWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
