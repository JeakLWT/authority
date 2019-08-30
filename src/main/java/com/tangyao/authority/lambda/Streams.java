package com.tangyao.authority.lambda;

import com.alibaba.fastjson.JSON;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    private enum Status {
        OPEN, CLOSED
    };

    private static final class Task {

        private final Status status;

        private final Integer points;


        Task(final Status status, final Integer points) {

            this.status = status;

            this.points = points;

        }
        public Integer getPoints() {

            return points;

        }

        public Status getStatus() {

            return status;

        }

        @Override

        public String toString() {

            return String.format("[%s, %d]", status, points);

        }

    }

    public static void main(String[] args) {
        final Collection< Task > tasks = Arrays.asList(

                new Task( Status.OPEN, 5 ),

                new Task( Status.OPEN, 13 ),

                new Task( Status.CLOSED, 8 )

        );
        List<Task> collect = tasks.stream().filter(s -> s.status == Status.OPEN).collect(Collectors.toList());
        System.out.println(JSON.toJSONString(collect));


        final Collection< String > result = tasks

            .stream()                                        // Stream< String >

            .mapToInt( Task::getPoints )                     // IntStream

            .asLongStream()                                  // LongStream

            .mapToDouble( points -> points / 26 )   // DoubleStream

            .boxed()                                         // Stream< Double >

            .mapToLong( weigth -> ( long )( weigth * 100 ) ) // LongStream

            .mapToObj( percentage -> percentage + "%" )      // Stream< String>

            .collect( Collectors.toList() );                 // List< String >




    }


}
