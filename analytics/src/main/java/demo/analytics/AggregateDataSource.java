package demo.analytics;

/**
 * An type of classes with distinct responsibilities from PDS.
 * <p>
 * What an ADS does
 * Serve as an additional layer between Endpoints and PDSs and encapsulate PDS functionalities
 * Each concrete ADS has its own POJOs for input
 * Generate PDS input POJOs for queries
 * Aggregate primitive query data
 * What an ADS does not
 * Perform primitive queries.
 */
public abstract class AggregateDataSource implements DataSource {

}
