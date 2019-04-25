package demo.analytics;

/**
 * An type of classes with distinct responsibilities from ADS.
 * <p>
 * What a PDS does
 * Perform indivisible business logic queries
 * Input and output are passed as POJOs
 * Each concrete PDS has its own POJO classes for both input and output
 * What a PDS does not
 * Handle formats of output (outputs are POJOs)
 */
public abstract class PrimitiveDataSource implements DataSource {

}
