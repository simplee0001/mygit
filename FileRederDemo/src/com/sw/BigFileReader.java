/*
package com.sw;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;

public class BigFileReader {
    //线程池大小
    private int threadPoolSize;
    //字符
    private Charset charset;
    private int bufferSize;
    private IFileHandle handle;

    private ExecutorService executorService;

    private long fileLength;

    private RandomAccessFile randomAccessFile;

    private Set<StartEndPair> startEndPairSet;

    private CyclicBarrier cyclicBarrier;

    private AtomicLong counter = new AtomicLong(0);

    public BigFileReader(File file, IFileHandle handle, Charset charset, int bufferSize, int threadPoolSize){
        this.fileLength = file.length();
        this.handle = handle;
        this.charset = charset;
        this.bufferSize = bufferSize;
        this.threadPoolSize = threadPoolSize;
        try {
            this.randomAccessFile = new RandomAccessFile(file,"r");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        this.executorService = Executors.newFixedThreadPool(threadPoolSize);
        startEndPairSet = new HashSet<StartEndPair>();
    }
    
    public void start(){
        long everySize = this.fileLength/this.threadPoolSize;
        calculateStartEnd(0,everySize);
    }

   // private void calculateStartEnd(int start, long everySize) {
        if()
    }


    private static class StartEndPair {
        public long start;
        public long end;

        @Override
        public String toString() {
            return "star="+start+";end="+end;
        }
    }
}
*/
