/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.practice.loader;

import com.kingland.practice.buffer.BaseBuffer;
import com.kingland.practice.utils.BusinessException;
import com.kingland.practice.utils.Common;

import java.io.*;

/**
 * @author KSC
 * @description This extends BaseLoader to get data from files
 */
public class FileLoader<T> extends BaseLoader {
    /**
     * the designation of sending
     */
    private final String designation;

    /**
     * line number recorder
     */
    private int lineNumber = 1;

    /**
     * total line numbers
     */
    private final int totalLines;

    /**
     * Constructor
     *
     * @param buffer      set the designation buffer
     * @param designation the designation of sending
     */
    public FileLoader(BaseBuffer<T> buffer, String designation) throws IOException {
        super(buffer);
        this.designation = designation;
        FileReader in = new FileReader(Common.FILE_PATH + designation);
        LineNumberReader reader = new LineNumberReader(in);
        String s = reader.readLine();
        int lines = 0;
        while (s != null) {
            lines++;
            s = reader.readLine();
        }
        reader.close();
        in.close();
        totalLines = lines;
    }

    /**
     * get data from files
     *
     * @return data which is from files
     */
    @Override
    public T getData() {
        File file = new File(Common.FILE_PATH + designation);
        if (!file.exists()) {
            throw new BusinessException(Common.FILE_NOT_EXIST_EXCEPTION);
        }
        String result = null;
        String s = "";
        try {
            LineNumberReader reader = new LineNumberReader(new FileReader(file));
            if (lineNumber <= 0 || lineNumber > totalLines) {
            }
            int lines = 0;
            while (s != null) {
                lines++;
                s = reader.readLine();
                if ((lines - lineNumber) == 0) {
                    result = s;
                    lineNumber++;
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(result.getClass().getName() + ": " + result);
        if (null == result) {
            throw new BusinessException(Common.FILE_END);
        }
        return (T) result;
    }

    /**
     * the entry point of this class
     */
    @Override
    public void run() {
        while (true) {
            T t = getData();
            if (null != t) {
                getBuffer().add(t);
            } else {
                break;
            }
        }
    }
}
