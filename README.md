[![Build Status](https://github.com/s50600822/jmh_tut/actions/workflows/main.yml/badge.svg)](https://github.com/s50600822/jmh_tut/actions)

| Benchmark                                    | Mode  | Cnt | Score    | Error   | Units |
|----------------------------------------------|-------|-----|----------|---------|-------|
| MyBenchmark.testPointHashMap                 | thrpt | 25  | 2169.424 | ±20.832 | ops/s |
| MyBenchmark.testPointHashMapFixedSize        | thrpt | 25  | 4046.385 | ±11.027 | ops/s |
| MyBenchmark.testWrongPointHashMap            | thrpt | 25  | 4.398    | ±0.009  | ops/s |
| MyBenchmark.testWrongPointHashMapFixedSize   | thrpt | 25  | 4.422    | ±0.018  | ops/s |


| Benchmark                           | Mode  | Cnt |        Score       |       Error       | Units |
|------------------------------------|-------|-----|-------------------|-------------------|-------|
| MyBenchmark.midByBitshift          | thrpt |  25 | 2692753077.446 ± | 24626724.827      | ops/s |
| MyBenchmark.midByDiv               | thrpt |  25 | 2695484028.500 ± | 29897567.172      | ops/s |


| Benchmark                            | Mode | Cnt |       Score      |      Error      | Units |
|--------------------------------------|------|-----|------------------|-----------------|-------|
| MyBenchmark.ThreeSumAbstractList     | thrpt| 25  | 17490.246        |± 222.214        | ops/s |
| MyBenchmark.ThreeSumList             | thrpt| 25  | 0.124            |± 0.024          | ops/s |



###REF
https://github.com/openjdk/jmh
