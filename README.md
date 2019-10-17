# MultiModule Coverage Issue
Attempt to fix issue where instrumented tests in an `application` module
 don't create coverage data for `library` module classes under test


Run 

```
gradlew createDebugCoverageReport
```

And see in `app/build/reports/coverage` that there is no mention of the 
Library class `LibraryObject`
