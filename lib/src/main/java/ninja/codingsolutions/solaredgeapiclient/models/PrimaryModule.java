package ninja.codingsolutions.solaredgeapiclient.models;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

/**
 * Primary module (inverter) metrics
 */
@Builder
@Data
@Jacksonized
public class PrimaryModule {
    private String manufacturerName;
    private String modelName;
    private double maximumPower;
    private double temperatureCoef;
}
