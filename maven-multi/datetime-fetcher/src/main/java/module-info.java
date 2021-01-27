module none.cvg.maven.datetime {
    // Specifies packages and their types are available to code with.
    exports none.cvg.maven.datetime.fetch;
    // Specifies packages and their types are available at runtime-only.
    opens none.cvg.maven.datetime.runtime;
    // Opened for Maven to run the JUnit tests
    // a static method in the tests needs this package opened.
    opens none.cvg.maven.datetime.fetch;
}