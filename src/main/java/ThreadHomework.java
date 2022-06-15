import java.util.Arrays;

public class ThreadHomework {
    private static int SIZE = 3_000_000;
    private static int CHUNK_COUNT = 2;

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        ThreadHomework threadHomework = new ThreadHomework();
        float[] a = new float[SIZE];

        Arrays.fill(a, 1f);

        long start = System.currentTimeMillis();
        threadHomework.run1(a);
        final long result1 = System.currentTimeMillis() - start;
        System.out.println("Время работы в один поток: " + result1);

        start = System.currentTimeMillis();
        threadHomework.run2(a, CHUNK_COUNT);
        final long result2 = System.currentTimeMillis() - start;
        System.out.println("Время работы нескольких потоков: " + result2);

        System.out.println("Отношение " + ((double) result1 / result2));
    }

    private void run2(float[] a, int threadCount) {
        int chunkSize = a.length / threadCount;
        float[][] chunks = new float[threadCount][chunkSize];
        Thread[] t = new Thread[threadCount];
        for (int i = 0, c = 0; i < a.length; i += chunkSize, c++) {
            chunks[c] = Arrays.copyOfRange(a, i, Math.min(i + chunkSize, a.length));
            int j = c;
            t[j] = new Thread(() -> run1(chunks[j]));
            t[j].start();
        }


        for (int i = 0; i < threadCount; i++) {
            try {
                t[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (int i = 0, c = 0; i < a.length; i += chunkSize, c++) {
            System.arraycopy(chunks[c], 0, a, i, chunks[c].length);
        }
    }


        private void run1 ( float[] a){
            for (int i = 0; i < a.length; i++) {
                a[i] = (float) (a[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        }

    }




