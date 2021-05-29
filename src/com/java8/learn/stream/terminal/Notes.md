## Terminal Operations

### joining()
- Concatenates the string stream.
- Has three overloaded versions.
    - joining()
    - joining(delimitter)
    - joining(delimitter, prefix, suffix)
    
### counting()
- Collector returns the total number of elements as a result.

### mapping()
- Applies transforming function and then collects.

### groupingBy()
- equivalent to SQL group by.
- Group elements based on a property.
- returns a map.
- Three versions available:
    - groupingBy(classifier)
    - groupingBy(classifier, downstream)
    - groupingBy(classifier, supplier, downstream)
  
### partitioningBy
- Kind of groupingBy().
- Accepts a predicate as an input.
- return type - Map<Boolean, Object>
- 2 versions:
    - partitioningBy(predicate)
    - partitioningBy(predicate, downstream)