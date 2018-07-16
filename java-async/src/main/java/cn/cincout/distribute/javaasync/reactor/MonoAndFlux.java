package cn.cincout.distribute.javaasync.reactor;

import reactor.core.publisher.Flux;

/**
 * Created by zhaoyu on 18-6-7.
 *
 * @author zhaoyu
 * @sine 1.8
 */
public class MonoAndFlux {
    public void generateFlux() {
        Flux.generate(sink -> {
            sink.next("Hello");
            sink.complete();
        }).subscribe(System.out::println);
    }

    public void createFlux() {
        Flux.create(fluxSink -> {
            for (int i = 0; i < 10; i++) {
                fluxSink.next(i);
            }
            fluxSink.complete();
        }).subscribe(System.out::println);
    }

    public void flux() {
        SampleSubscriber<Integer> ss = new SampleSubscriber<>();

        Flux<Integer> ints = Flux.range(1, 10)
                .map(i -> {
                    if (i <= 20) {
                        return i;
                    }
                    throw new RuntimeException("Got to 4");
                });
        /*ints.subscribe(
                i -> System.out.println(i),
                error -> System.err.println("error " + error),
                () -> System.out.println("Done"),
                s -> ss.request(10)
        );*/
        ints.subscribe(ss);
    }

    public static void main(String[] args) {
        new MonoAndFlux().flux();
    }
}
