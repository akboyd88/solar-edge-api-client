package ninja.codingsolutions.solaredgeapiclient.models.impl;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;
import ninja.codingsolutions.solaredgeapiclient.models.Location;

/**
 * Location of site described with
 * country, state, city, and address
 */
@Builder
@Data
@Jacksonized
public class LocationImpl implements Location {
    private String country;
    private String state;
    private String city;
    private String address;
    private String address2;
    private String zip;
    private String timeZone;
    private String countryCode;
    private String stateCode;
}