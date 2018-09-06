package cn.cincout.distribute.learnjava.nio;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by zhaoyu on 18-7-30.
 *
 * @author zhaoyu
 * @sine 1.8
 */
public class ChannelCopy {
    private static final int BSIZE = 1024;

    public static void main(String[] args) {
        String inFileName = "data.in";
        String outFileName = "data.out";

        try {
            FileChannel in = new FileInputStream(inFileName).getChannel();
            FileChannel out = new FileOutputStream(outFileName).getChannel();
            ByteBuffer byteBuffer = ByteBuffer.allocate(BSIZE);

            // first way
           /* while (in.read(byteBuffer) != -1) {
                byteBuffer.flip();
                out.write(byteBuffer);
                byteBuffer.clear();
            }*/

            // second way
            in.transferTo(0, in.size(), out);
            // or
            // out.transferFrom(in, 0, in.size());
            System.out.println("finished copy ...");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
