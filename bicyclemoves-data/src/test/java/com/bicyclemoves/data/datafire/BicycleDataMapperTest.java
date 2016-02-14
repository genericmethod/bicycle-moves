package com.bicyclemoves.data.datafire;

import com.bicyclemoves.data.model.BicycleDock;
import com.genericmethod.datafire.exception.DataFireException;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class BicycleDataMapperTest {

    @Test
    public void testMapper() throws DataFireException {
        String jsonData = "{\n" +
                "  \"bounding_box\": {\n" +
                "    \"northeast_corner_coords\": [51.52456169, -0.176415994],\n" +
                "    \"southwest_corner_coords\": [51.51733558, -0.341054]\n" +
                "  },\n" +
                "  \"elements\": [{\n" +
                "    \"cycles_available\": 30,\n" +
                "    \"cycles_broken\": 0,\n" +
                "    \"name\": \"BBC White City, White City\",\n" +
                "    \"kind\": \"cycledock\",\n" +
                "    \"cycles_spaces\": 6,\n" +
                "    \"brand_id\": \"BorisBike\",\n" +
                "    \"coords\": [51.514767, -0.225787],\n" +
                "    \"walk_time_seconds\": 2002,\n" +
                "    \"cycles_total\": 36,\n" +
                "    \"id\": \"601\"\n" +
                "  }, {\n" +
                "    \"cycles_available\": 8,\n" +
                "    \"cycles_broken\": 1,\n" +
                "    \"name\": \"Westfield Ariel Way, White City\",\n" +
                "    \"kind\": \"cycledock\",\n" +
                "    \"cycles_spaces\": 33,\n" +
                "    \"brand_id\": \"BorisBike\",\n" +
                "    \"coords\": [51.509158, -0.224103],\n" +
                "    \"walk_time_seconds\": 2298,\n" +
                "    \"cycles_total\": 42,\n" +
                "    \"id\": \"566\"\n" +
                "  }, {\n" +
                "    \"cycles_available\": 23,\n" +
                "    \"cycles_broken\": 0,\n" +
                "    \"name\": \"Freston Road, Avondale\",\n" +
                "    \"kind\": \"cycledock\",\n" +
                "    \"cycles_spaces\": 0,\n" +
                "    \"brand_id\": \"BorisBike\",\n" +
                "    \"coords\": [51.5129814, -0.219486603],\n" +
                "    \"walk_time_seconds\": 2400,\n" +
                "    \"cycles_total\": 23,\n" +
                "    \"id\": \"741\"\n" +
                "  }]\n" +
                "}";

        BicycleDataMapper mapper = new BicycleDataMapper();
        final List<BicycleDock> elements = mapper.mapToModel(jsonData);
        assertEquals(3, elements.size());
        assertEquals(30,elements.get(0).getCyclesAvailable().intValue());

    }
}
