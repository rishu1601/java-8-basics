- Streams is a sequence of elements which can be created out of a Collection or any kind of I/O resource.
- Stream operation can be performed in parallel or sequential.
    - parallel   -> list.parallelStream()
    - sequential -> list.stream()

- How stream API works?
    - Intermediate Operation
    - Terminal Operation
    - Stream pipeline
    - Streams are lazy instantiated.

- Collectors can be traversed only once, stream can be traversed only once.

- map() -> changes one type to another.
- flatMap() -> converts one type to another. (Used with a stream containing multiple elements in it).
       - Stream<List>, Stream<Map>, Stream<Set>

- reduce() -> Terminal function, reduces the contents of stream to a single value. (inputValue, BinaryOperator<>)
- limit(n) -> limit the no. of elements in stream to n.
- skip(n) -> skip the n elements from the stream.

- Stream factory methods:
    - of() - creates stream of certain values passed to this method.
    - iterate(), generate() - used to create infinite streams.