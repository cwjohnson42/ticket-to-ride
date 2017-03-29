package delta.monstarz;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JSONReader {
	public static JsonObject readJSON(String fileLocation) {
		JsonObject json = null;
		try
		{
			String contents = new String(Files.readAllBytes(Paths.get(fileLocation)));
//			String contents = jsonString;

			//Parse JSON
			JsonParser parser = new JsonParser();
			json = parser.parse(contents).getAsJsonObject();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return json;
	}

	private static String jsonString = "{" +
			"  \"TrainCount\": 45," +
			"  \"EndGameTrainCount\": 2," +
			"  \"Map\": {" +
			"    \"file\": \"mapNA.png\"" +
			"  }," +
			"  \"Cities\": [" +
			"    \"Atlanta\"," +
			"    \"Boston\"," +
			"    \"Calgary\"," +
			"    \"Charleston\"," +
			"    \"Chicago\"," +
			"    \"Dallas\"," +
			"    \"Denver\"," +
			"    \"Duluth\"," +
			"    \"El Paso\"," +
			"    \"Helena\"," +
			"    \"Houston\"," +
			"    \"Kansas City\"," +
			"    \"Las Vegas\"," +
			"    \"Little Rock\"," +
			"    \"Los Angeles\"," +
			"    \"Miami\"," +
			"    \"Montreal\"," +
			"    \"Nashville\"," +
			"    \"New Orleans\"," +
			"    \"New York\"," +
			"    \"Oklahoma City\"," +
			"    \"Omaha\"," +
			"    \"Phoenix\"," +
			"    \"Portland\"," +
			"    \"Pittsburgh\"," +
			"    \"Raleigh\"," +
			"    \"Saint Louis\"," +
			"    \"Salt Lake City\"," +
			"    \"San Francisco\"," +
			"    \"Santa Fe\"," +
			"    \"Sault Ste. Marie\"," +
			"    \"Seattle\"," +
			"    \"Toronto\"," +
			"    \"Vancouver\"," +
			"    \"Washington\"," +
			"    \"Winnipeg\"" +
			"  ]," +
			"  \"RouteList\":[" +
			"    {" +
			"      \"id\": 0," +
			"      \"doubleID\": 1," +
			"      \"endpoints\":[\"New York\", \"Boston\"]," +
			"      \"length\":2," +
			"      \"color\": \"red\"" +
			"    }," +
			"    {" +
			"      \"id\": 1," +
			"      \"doubleID\": 0," +
			"      \"endpoints\":[\"New York\", \"Boston\"]," +
			"      \"length\":2," +
			"      \"color\": \"yellow\"" +
			"    }," +
			"    {" +
			"      \"id\": 2," +
			"      \"doubleID\": -1," +
			"      \"endpoints\":[\"Helena\", \"Calgary\"]," +
			"      \"length\":4," +
			"      \"color\": \"gray\"" +
			"    }," +
			"    {" +
			"      \"id\": 3," +
			"      \"doubleID\": -1," +
			"      \"endpoints\":[\"Winnipeg\", \"Calgary\"]," +
			"      \"length\":6," +
			"      \"color\": \"white\"" +
			"    }," +
			"    {" +
			"      \"id\": 4," +
			"      \"doubleID\": -1," +
			"      \"endpoints\":[\"Miami\", \"Charleston\"]," +
			"      \"length\":4," +
			"      \"color\": \"pink\"," +
			"      \"segments\": [" +
			"        {" +
			"          \"x\": 1600," +
			"          \"y\": 765," +
			"          \"rotation\": 86" +
			"        }," +
			"        {" +
			"          \"x\": 1603," +
			"          \"y\": 833," +
			"          \"rotation\": 81" +
			"        }," +
			"        {" +
			"          \"x\": 1613," +
			"          \"y\": 898," +
			"          \"rotation\": 75" +
			"        }," +
			"        {" +
			"          \"x\": 1634," +
			"          \"y\": 960," +
			"          \"rotation\": 68" +
			"        }" +
			"      ]" +
			"    }," +
			"    {" +
			"      \"id\": 5," +
			"      \"doubleID\": -1," +
			"      \"endpoints\":[\"Raleigh\", \"Charleston\"]," +
			"      \"length\":2," +
			"      \"color\": \"gray\"" +
			"    }," +
			"    {" +
			"      \"id\": 6," +
			"      \"doubleID\": -1," +
			"      \"endpoints\":[\"Duluth\", \"Chicago\"]," +
			"      \"length\":3," +
			"      \"color\": \"red\"" +
			"    }," +
			"    {" +
			"      \"id\": 7," +
			"      \"doubleID\": -1," +
			"      \"endpoints\":[\"Omaha\", \"Chicago\"]," +
			"      \"length\":4," +
			"      \"color\": \"blue\"" +
			"    }," +
			"    {" +
			"      \"id\": 8," +
			"      \"doubleID\": 9," +
			"      \"endpoints\":[\"Pittsburgh\", \"Chicago\"]," +
			"      \"length\":3," +
			"      \"color\": \"black\"" +
			"    }," +
			"    {" +
			"      \"id\": 9," +
			"      \"doubleID\": 8," +
			"      \"endpoints\":[\"Pittsburgh\", \"Chicago\"]," +
			"      \"length\":3," +
			"      \"color\": \"orange\"" +
			"    }," +
			"    {" +
			"      \"id\": 10," +
			"      \"doubleID\": 11," +
			"      \"endpoints\":[\"Saint Louis\", \"Chicago\"]," +
			"      \"length\":2," +
			"      \"color\": \"green\"" +
			"    }," +
			"    {" +
			"      \"id\": 11," +
			"      \"doubleID\": 10," +
			"      \"endpoints\":[\"Saint Louis\", \"Chicago\"]," +
			"      \"length\":2," +
			"      \"color\": \"white\"" +
			"    }," +
			"    {" +
			"      \"id\": 12," +
			"      \"doubleID\": -1," +
			"      \"endpoints\":[\"Toronto\", \"Chicago\"]," +
			"      \"length\":4," +
			"      \"color\": \"gray\"" +
			"    }," +
			"    {" +
			"      \"id\": 13," +
			"      \"doubleID\": -1," +
			"      \"endpoints\":[\"El Paso\", \"Dallas\"]," +
			"      \"length\":4," +
			"      \"color\": \"red\"" +
			"    }," +
			"    {" +
			"      \"id\": 14," +
			"      \"doubleID\": 15," +
			"      \"endpoints\":[\"Houston\", \"Dallas\"]," +
			"      \"length\":1," +
			"      \"color\": \"gray\"" +
			"    }," +
			"    {" +
			"      \"id\": 15," +
			"      \"doubleID\": 14," +
			"      \"endpoints\":[\"Houston\", \"Dallas\"]," +
			"      \"length\":1," +
			"      \"color\": \"gray\"" +
			"    }," +
			"    {" +
			"      \"id\": 16," +
			"      \"doubleID\": -1," +
			"      \"endpoints\":[\"Little Rock\", \"Dallas\"]," +
			"      \"length\":2," +
			"      \"color\": \"gray\"" +
			"    }," +
			"    {" +
			"      \"id\": 17," +
			"      \"doubleID\": 18," +
			"      \"endpoints\":[\"Oklahoma City\", \"Dallas\"]," +
			"      \"length\":2," +
			"      \"color\": \"gray\"" +
			"    }," +
			"    {" +
			"      \"id\": 18," +
			"      \"doubleID\": 17," +
			"      \"endpoints\":[\"Oklahoma City\", \"Dallas\"]," +
			"      \"length\":2," +
			"      \"color\": \"gray\"" +
			"    }," +
			"    {" +
			"      \"id\": 19," +
			"      \"doubleID\": -1," +
			"      \"endpoints\":[\"Helena\", \"Denver\"]," +
			"      \"length\":4," +
			"      \"color\": \"pink\"" +
			"    }," +
			"    {" +
			"      \"id\": 20," +
			"      \"doubleID\": 21," +
			"      \"endpoints\":[\"Kansas City\", \"Denver\"]," +
			"      \"length\":4," +
			"      \"color\": \"black\"" +
			"    }," +
			"    {" +
			"      \"id\": 21," +
			"      \"doubleID\": 20," +
			"      \"endpoints\":[\"Kansas City\", \"Denver\"]," +
			"      \"length\":4," +
			"      \"color\": \"orange\"" +
			"    }," +
			"    {" +
			"      \"id\": 22," +
			"      \"doubleID\": -1," +
			"      \"endpoints\":[\"Oklahoma City\", \"Denver\"]," +
			"      \"length\":4," +
			"      \"color\": \"red\"" +
			"    }," +
			"    {" +
			"      \"id\": 23," +
			"      \"doubleID\": -1," +
			"      \"endpoints\":[\"Omaha\", \"Denver\"]," +
			"      \"length\":4," +
			"      \"color\": \"pink\"" +
			"    }," +
			"    {" +
			"      \"id\": 24," +
			"      \"doubleID\": -1," +
			"      \"endpoints\":[\"Phoenix\", \"Denver\"]," +
			"      \"length\":5," +
			"      \"color\": \"white\"" +
			"    }," +
			"    {" +
			"      \"id\": 25," +
			"      \"doubleID\": 26," +
			"      \"endpoints\":[\"Salt Lake City\", \"Denver\"]," +
			"      \"length\":3," +
			"      \"color\": \"red\"" +
			"    }," +
			"    {" +
			"      \"id\": 26," +
			"      \"doubleID\": 25," +
			"      \"endpoints\":[\"Salt Lake City\", \"Denver\"]," +
			"      \"length\":3," +
			"      \"color\": \"yellow\"" +
			"    }," +
			"    {" +
			"      \"id\": 27," +
			"      \"doubleID\": -1," +
			"      \"endpoints\":[\"Santa Fe\", \"Denver\"]," +
			"      \"length\":2," +
			"      \"color\": \"gray\"" +
			"    }," +
			"    {" +
			"      \"id\": 28," +
			"      \"doubleID\": -1," +
			"      \"endpoints\":[\"Helena\", \"Duluth\"]," +
			"      \"length\":6," +
			"      \"color\": \"orange\"" +
			"    }," +
			"    {" +
			"      \"id\": 29," +
			"      \"doubleID\": 30," +
			"      \"endpoints\":[\"Omaha\", \"Duluth\"]," +
			"      \"length\":2," +
			"      \"color\": \"gray\"" +
			"    }," +
			"    {" +
			"      \"id\": 30," +
			"      \"doubleID\": 29," +
			"      \"endpoints\":[\"Omaha\", \"Duluth\"]," +
			"      \"length\":2," +
			"      \"color\": \"gray\"" +
			"    }," +
			"    {" +
			"      \"id\": 31," +
			"      \"doubleID\": -1," +
			"      \"endpoints\":[\"Sault Ste. Marie\", \"Duluth\"]," +
			"      \"length\":3," +
			"      \"color\": \"gray\"" +
			"    }," +
			"    {" +
			"      \"id\": 32," +
			"      \"doubleID\": -1," +
			"      \"endpoints\":[\"Toronto\", \"Duluth\"]," +
			"      \"length\":6," +
			"      \"color\": \"pink\"" +
			"    }," +
			"    {" +
			"      \"id\": 33," +
			"      \"doubleID\": -1," +
			"      \"endpoints\":[\"Winnipeg\", \"Duluth\"]," +
			"      \"length\":4," +
			"      \"color\": \"black\"" +
			"    }," +
			"    {" +
			"      \"id\": 34," +
			"      \"doubleID\": -1," +
			"      \"endpoints\":[\"Houston\", \"El Paso\"]," +
			"      \"length\":6," +
			"      \"color\": \"green\"" +
			"    }," +
			"    {" +
			"      \"id\": 35," +
			"      \"doubleID\": -1," +
			"      \"endpoints\":[\"Los Angeles\", \"El Paso\"]," +
			"      \"length\":6," +
			"      \"color\": \"black\"" +
			"    }," +
			"    {" +
			"      \"id\": 36," +
			"      \"doubleID\": -1," +
			"      \"endpoints\":[\"Oklahoma City\", \"El Paso\"]," +
			"      \"length\":5," +
			"      \"color\": \"yellow\"" +
			"    }," +
			"    {" +
			"      \"id\": 37," +
			"      \"doubleID\": -1," +
			"      \"endpoints\":[\"Phoenix\", \"El Paso\"]," +
			"      \"length\":3," +
			"      \"color\": \"gray\"," +
			"      \"segments\": [" +
			"        {" +
			"          \"x\": 442," +
			"          \"y\": 895," +
			"          \"rotation\": 16" +
			"        }," +
			"        {" +
			"          \"x\": 506," +
			"          \"y\": 914," +
			"          \"rotation\": 16" +
			"        }," +
			"        {" +
			"          \"x\": 571," +
			"          \"y\": 932," +
			"          \"rotation\": 16" +
			"        }" +
			"      ]" +
			"    }," +
			"    {" +
			"      \"id\": 38," +
			"      \"doubleID\": -1," +
			"      \"endpoints\":[\"Santa Fe\", \"El Paso\"]," +
			"      \"length\":2," +
			"      \"color\": \"gray\"," +
			"      \"segments\": [" +
			"        {" +
			"          \"x\": 635," +
			"          \"y\": 938," +
			"          \"rotation\": -87" +
			"        }," +
			"        {" +
			"          \"x\": 639," +
			"          \"y\": 871," +
			"          \"rotation\": -87" +
			"        }" +
			"      ]" +
			"    }," +
			"    {" +
			"      \"id\": 39," +
			"      \"doubleID\": -1," +
			"      \"endpoints\":[\"Omaha\", \"Helena\"]," +
			"      \"length\":5," +
			"      \"color\": \"red\"," +
			"      \"segments\": [" +
			"        {" +
			"          \"x\": 604," +
			"          \"y\": 353," +
			"          \"rotation\": 23" +
			"        }," +
			"        {" +
			"          \"x\": 667," +
			"          \"y\": 378," +
			"          \"rotation\": 23" +
			"        }," +
			"        {" +
			"          \"x\": 729," +
			"          \"y\": 404," +
			"          \"rotation\": 23" +
			"        }," +
			"        {" +
			"          \"x\": 791," +
			"          \"y\": 430," +
			"          \"rotation\": 23" +
			"        }," +
			"        {" +
			"          \"x\": 854," +
			"          \"y\": 454," +
			"          \"rotation\": 23" +
			"        }" +
			"      ]" +
			"    }," +
			"    {" +
			"      \"id\": 40," +
			"      \"doubleID\": -1," +
			"      \"endpoints\":[\"Salt Lake City\", \"Helena\"]," +
			"      \"length\":3," +
			"      \"color\": \"pink\"," +
			"      \"segments\": [" +
			"        {" +
			"          \"x\": 436," +
			"          \"y\": 520," +
			"          \"rotation\": -59" +
			"        }," +
			"        {" +
			"          \"x\": 471," +
			"          \"y\": 462," +
			"          \"rotation\": -59" +
			"        }," +
			"        {" +
			"          \"x\": 505," +
			"          \"y\": 405," +
			"          \"rotation\": -59" +
			"        }" +
			"      ]" +
			"    }," +
			"    {" +
			"      \"id\": 41," +
			"      \"doubleID\": -1," +
			"      \"endpoints\":[\"Seattle\", \"Helena\"]," +
			"      \"length\":6," +
			"      \"color\": \"yellow\"," +
			"      \"segments\": [" +
			"        {" +
			"          \"x\": 143," +
			"          \"y\": 241," +
			"          \"rotation\": 14" +
			"        }," +
			"        {" +
			"          \"x\": 209," +
			"          \"y\": 257," +
			"          \"rotation\": 14" +
			"        }," +
			"        {" +
			"          \"x\": 276," +
			"          \"y\": 272," +
			"          \"rotation\": 14" +
			"        }," +
			"        {" +
			"          \"x\": 342," +
			"          \"y\": 286," +
			"          \"rotation\": 14" +
			"        }," +
			"        {" +
			"          \"x\": 407," +
			"          \"y\": 301," +
			"          \"rotation\": 14" +
			"        }," +
			"        {" +
			"          \"x\": 473," +
			"          \"y\": 315," +
			"          \"rotation\": 14" +
			"        }" +
			"      ]" +
			"    }," +
			"    {" +
			"      \"id\": 42," +
			"      \"doubleID\": -1," +
			"      \"endpoints\":[\"Winnipeg\", \"Helena\"]," +
			"      \"length\":4," +
			"      \"color\": \"blue\"," +
			"      \"segments\": [" +
			"        {" +
			"          \"x\": 578," +
			"          \"y\": 302," +
			"          \"rotation\": -45" +
			"        }," +
			"        {" +
			"          \"x\": 625," +
			"          \"y\": 254," +
			"          \"rotation\": -45" +
			"        }," +
			"        {" +
			"          \"x\": 672," +
			"          \"y\": 206," +
			"          \"rotation\": -45" +
			"        }," +
			"        {" +
			"          \"x\": 720," +
			"          \"y\": 158," +
			"          \"rotation\": -45" +
			"        }" +
			"      ]" +
			"    }," +
			"    {" +
			"      \"id\": 43," +
			"      \"doubleID\": -1," +
			"      \"endpoints\":[\"New Orleans\", \"Houston\"]," +
			"      \"length\":2," +
			"      \"color\": \"gray\"," +
			"      \"segments\": [" +
			"        {" +
			"          \"x\": 1083," +
			"          \"y\": 982," +
			"          \"rotation\": -9" +
			"        }," +
			"        {" +
			"          \"x\": 1149," +
			"          \"y\": 971," +
			"          \"rotation\": -9" +
			"        }" +
			"      ]" +
			"    }," +
			"    {" +
			"      \"id\": 44," +
			"      \"doubleID\": 45," +
			"      \"endpoints\":[\"Oklahoma City\", \"Kansas City\"]," +
			"      \"length\":2," +
			"      \"color\": \"gray\"," +
			"      \"segments\": [" +
			"        {" +
			"          \"x\": 935," +
			"          \"y\": 727," +
			"          \"rotation\": -73" +
			"        }," +
			"        {" +
			"          \"x\": 954," +
			"          \"y\": 663," +
			"          \"rotation\": -73" +
			"        }" +
			"      ]" +
			"    }," +
			"    {" +
			"      \"id\": 45," +
			"      \"doubleID\": 44," +
			"      \"endpoints\":[\"Oklahoma City\", \"Kansas City\"]," +
			"      \"length\":2," +
			"      \"color\": \"gray\"," +
			"      \"segments\": [" +
			"        {" +
			"          \"x\": 957," +
			"          \"y\": 734," +
			"          \"rotation\": -73" +
			"        }," +
			"        {" +
			"          \"x\": 976," +
			"          \"y\": 669," +
			"          \"rotation\": -73" +
			"        }" +
			"      ]" +
			"    }," +
			"    {" +
			"      \"id\": 46," +
			"      \"doubleID\": 47," +
			"      \"endpoints\":[\"Omaha\", \"Kansas City\"]," +
			"      \"length\":1," +
			"      \"color\": \"gray\"," +
			"      \"segments\": [" +
			"        {" +
			"          \"x\": 973," +
			"          \"y\": 510," +
			"          \"rotation\": 62" +
			"        }" +
			"      ]" +
			"    }," +
			"    {" +
			"      \"id\": 47," +
			"      \"doubleID\": 46," +
			"      \"endpoints\":[\"Omaha\", \"Kansas City\"]," +
			"      \"length\":1," +
			"      \"color\": \"gray\"," +
			"      \"segments\": [" +
			"        {" +
			"          \"x\": 951," +
			"          \"y\": 520," +
			"          \"rotation\": 62" +
			"        }" +
			"      ]" +
			"    }," +
			"    {" +
			"      \"id\": 48," +
			"      \"doubleID\": 49," +
			"      \"endpoints\":[\"Saint Louis\", \"Kansas City\"]," +
			"      \"length\":2," +
			"      \"color\": \"blue\"," +
			"      \"segments\": [" +
			"        {" +
			"          \"x\": 1003," +
			"          \"y\": 570," +
			"          \"rotation\": -1" +
			"        }," +
			"        {" +
			"          \"x\": 1070," +
			"          \"y\": 569," +
			"          \"rotation\": -1" +
			"        }" +
			"      ]" +
			"    }," +
			"    {" +
			"      \"id\": 49," +
			"      \"doubleID\": 48," +
			"      \"endpoints\":[\"Saint Louis\", \"Kansas City\"]," +
			"      \"length\":2," +
			"      \"color\": \"pink\"," +
			"      \"segments\": [" +
			"        {" +
			"          \"x\": 1004," +
			"          \"y\": 594," +
			"          \"rotation\": -1" +
			"        }," +
			"        {" +
			"          \"x\": 1071," +
			"          \"y\": 592," +
			"          \"rotation\": -1" +
			"        }" +
			"      ]" +
			"    }," +
			"    {" +
			"      \"id\": 50," +
			"      \"doubleID\": -1," +
			"      \"endpoints\":[\"Los Angeles\", \"Las Vegas\"]," +
			"      \"length\":2," +
			"      \"color\": \"gray\"," +
			"      \"segments\": [" +
			"        {" +
			"          \"x\": 194," +
			"          \"y\": 845," +
			"          \"rotation\": -63" +
			"        }," +
			"        {" +
			"          \"x\": 236," +
			"          \"y\": 778," +
			"          \"rotation\": -12" +
			"        }" +
			"      ]" +
			"    }," +
			"    {" +
			"      \"id\": 51," +
			"      \"doubleID\": -1," +
			"      \"endpoints\":[\"Salt Lake City\", \"Las Vegas\"]," +
			"      \"length\":3," +
			"      \"color\": \"orange\"," +
			"      \"segments\": [" +
			"        {" +
			"          \"x\": 335," +
			"          \"y\": 758," +
			"          \"rotation\": -44" +
			"        }," +
			"        {" +
			"          \"x\": 381," +
			"          \"y\": 709," +
			"          \"rotation\": -65" +
			"        }," +
			"        {" +
			"          \"x\": 406," +
			"          \"y\": 648," +
			"          \"rotation\": -82" +
			"        }" +
			"      ]" +
			"    }," +
			"    {" +
			"      \"id\": 52," +
			"      \"doubleID\": -1," +
			"      \"endpoints\":[\"Nashville\", \"Little Rock\"]," +
			"      \"length\":3," +
			"      \"color\": \"white\"," +
			"      \"segments\": [" +
			"        {" +
			"          \"x\": 1134," +
			"          \"y\": 750," +
			"          \"rotation\": -6" +
			"        }," +
			"        {" +
			"          \"x\": 1201," +
			"          \"y\": 743," +
			"          \"rotation\": -25" +
			"        }," +
			"        {" +
			"          \"x\": 1261," +
			"          \"y\": 714," +
			"          \"rotation\": -41" +
			"        }" +
			"      ]" +
			"    }," +
			"    {" +
			"      \"id\": 53," +
			"      \"doubleID\": -1," +
			"      \"endpoints\":[\"New Orleans\", \"Little Rock\"]," +
			"      \"length\":3," +
			"      \"color\": \"green\"," +
			"      \"segments\": [" +
			"        {" +
			"          \"x\": 1132," +
			"          \"y\": 777," +
			"          \"rotation\": 63" +
			"        }," +
			"        {" +
			"          \"x\": 1164," +
			"          \"y\": 836," +
			"          \"rotation\": 63" +
			"        }," +
			"        {" +
			"          \"x\": 1196," +
			"          \"y\": 896," +
			"          \"rotation\": 63" +
			"        }" +
			"      ]" +
			"    }," +
			"    {" +
			"      \"id\": 54," +
			"      \"doubleID\": -1," +
			"      \"endpoints\":[\"Oklahoma City\", \"Little Rock\"]," +
			"      \"length\":2," +
			"      \"color\": \"gray\"," +
			"      \"segments\": [" +
			"        {" +
			"          \"x\": 971," +
			"          \"y\": 748," +
			"          \"rotation\": -1" +
			"        }," +
			"        {" +
			"          \"x\": 1037," +
			"          \"y\": 746," +
			"          \"rotation\": -1" +
			"        }" +
			"      ]" +
			"    }," +
			"    {" +
			"      \"id\": 55," +
			"      \"doubleID\": -1," +
			"      \"endpoints\":[\"Saint Louis\", \"Little Rock\"]," +
			"      \"length\":2," +
			"      \"color\": \"gray\"," +
			"      \"segments\": [" +
			"        {" +
			"          \"x\": 1108," +
			"          \"y\": 732," +
			"          \"rotation\": -76" +
			"        }," +
			"        {" +
			"          \"x\": 1124," +
			"          \"y\": 667," +
			"          \"rotation\": -76" +
			"        }" +
			"      ]" +
			"    }," +
			"    {" +
			"      \"id\": 56," +
			"      \"doubleID\": -1," +
			"      \"endpoints\":[\"Phoenix\", \"Los Angeles\"]," +
			"      \"length\":3," +
			"      \"color\": \"gray\"," +
			"      \"segments\": [" +
			"        {" +
			"          \"x\": 214," +
			"          \"y\": 862," +
			"          \"rotation\": -9" +
			"        }," +
			"        {" +
			"          \"x\": 282," +
			"          \"y\": 854," +
			"          \"rotation\": 0" +
			"        }," +
			"        {" +
			"          \"x\": 351," +
			"          \"y\": 856," +
			"          \"rotation\": 14" +
			"        }" +
			"      ]" +
			"    }," +
			"    {" +
			"      \"id\": 57," +
			"      \"doubleID\": -1," +
			"      \"endpoints\":[\"New Orleans\", \"Miami\"]," +
			"      \"length\":6," +
			"      \"color\": \"red\"," +
			"      \"segments\": [" +
			"        {" +
			"          \"x\": 1276," +
			"          \"y\": 967," +
			"          \"rotation\": -31" +
			"        }," +
			"        {" +
			"          \"x\": 1337," +
			"          \"y\": 933," +
			"          \"rotation\": -15" +
			"        }," +
			"        {" +
			"          \"x\": 1404," +
			"          \"y\": 917," +
			"          \"rotation\": 0" +
			"        }," +
			"        {" +
			"          \"x\": 1477," +
			"          \"y\": 921," +
			"          \"rotation\": 29" +
			"        }," +
			"        {" +
			"          \"x\": 1537," +
			"          \"y\": 956," +
			"          \"rotation\": 39" +
			"        }," +
			"        {" +
			"          \"x\": 1588," +
			"          \"y\": 1001," +
			"          \"rotation\": 49" +
			"        }" +
			"      ]" +
			"    }," +
			"    {" +
			"      \"id\": 58," +
			"      \"doubleID\": -1," +
			"      \"endpoints\":[\"New York\", \"Montreal\"]," +
			"      \"length\":3," +
			"      \"color\": \"blue\"," +
			"      \"segments\": [" +
			"        {" +
			"          \"x\": 1594," +
			"          \"y\": 111," +
			"          \"rotation\": 80" +
			"        }," +
			"        {" +
			"          \"x\": 1604," +
			"          \"y\": 178," +
			"          \"rotation\": 80" +
			"        }," +
			"        {" +
			"          \"x\": 1615," +
			"          \"y\": 245," +
			"          \"rotation\": 80" +
			"        }" +
			"      ]" +
			"    }," +
			"    {" +
			"      \"id\": 59," +
			"      \"doubleID\": -1," +
			"      \"endpoints\":[\"Sault Ste. Marie\", \"Montreal\"]," +
			"      \"length\":5," +
			"      \"color\": \"black\"," +
			"      \"segments\": [" +
			"        {" +
			"          \"x\": 1255," +
			"          \"y\": 175," +
			"          \"rotation\": -41" +
			"        }," +
			"        {" +
			"          \"x\": 1309," +
			"          \"y\": 131," +
			"          \"rotation\": -29" +
			"        }," +
			"        {" +
			"          \"x\": 1370," +
			"          \"y\": 100," +
			"          \"rotation\": -20" +
			"        }," +
			"        {" +
			"          \"x\": 1435," +
			"          \"y\": 78," +
			"          \"rotation\": -13" +
			"        }," +
			"        {" +
			"          \"x\": 1503," +
			"          \"y\": 64," +
			"          \"rotation\": 0" +
			"        }" +
			"      ]" +
			"    }," +
			"    {" +
			"      \"id\": 60," +
			"      \"doubleID\": -1," +
			"      \"endpoints\":[\"Toronto\", \"Montreal\"]," +
			"      \"length\":3," +
			"      \"color\": \"gray\"," +
			"      \"segments\": [" +
			"        {" +
			"          \"x\": 1428," +
			"          \"y\": 212," +
			"          \"rotation\": -59" +
			"        }," +
			"        {" +
			"          \"x\": 1466," +
			"          \"y\": 151," +
			"          \"rotation\": -42" +
			"        }," +
			"        {" +
			"          \"x\": 1520," +
			"          \"y\": 106," +
			"          \"rotation\": -25" +
			"        }" +
			"      ]" +
			"    }," +
			"    {" +
			"      \"id\": 61," +
			"      \"doubleID\": -1," +
			"      \"endpoints\":[\"Pittsburgh\", \"Nashville\"]," +
			"      \"length\":4," +
			"      \"color\": \"yellow\"," +
			"      \"segments\": [" +
			"        {" +
			"          \"x\": 1295," +
			"          \"y\": 645," +
			"          \"rotation\": -62" +
			"        }," +
			"        {" +
			"          \"x\": 1328," +
			"          \"y\": 583," +
			"          \"rotation\": -50" +
			"        }," +
			"        {" +
			"          \"x\": 1375," +
			"          \"y\": 530," +
			"          \"rotation\": -33" +
			"        }," +
			"        {" +
			"          \"x\": 1429," +
			"          \"y\": 493," +
			"          \"rotation\": -55" +
			"        }" +
			"      ]" +
			"    }," +
			"    {" +
			"      \"id\": 62," +
			"      \"doubleID\": -1," +
			"      \"endpoints\":[\"Raleigh\", \"Nashville\"]," +
			"      \"length\":3," +
			"      \"color\": \"black\"," +
			"      \"segments\": [" +
			"        {" +
			"          \"x\": 1334," +
			"          \"y\": 643," +
			"          \"rotation\": -31" +
			"        }," +
			"        {" +
			"          \"x\": 1397," +
			"          \"y\": 608," +
			"          \"rotation\": -13" +
			"        }," +
			"        {" +
			"          \"x\": 1465," +
			"          \"y\": 594," +
			"          \"rotation\": 4" +
			"        }" +
			"      ]" +
			"    }," +
			"    {" +
			"      \"id\": 63," +
			"      \"doubleID\": -1," +
			"      \"endpoints\":[\"Saint Louis\", \"Nashville\"]," +
			"      \"length\":2," +
			"      \"color\": \"gray\"," +
			"      \"segments\": [" +
			"        {" +
			"          \"x\": 1168," +
			"          \"y\": 618," +
			"          \"rotation\": 17" +
			"        }," +
			"        {" +
			"          \"x\": 1232," +
			"          \"y\": 638," +
			"          \"rotation\": 17" +
			"        }" +
			"      ]" +
			"    }," +
			"    {" +
			"      \"id\": 64," +
			"      \"doubleID\": 65," +
			"      \"endpoints\":[\"Pittsburgh\", \"New York\"]," +
			"      \"length\":2," +
			"      \"color\": \"green\"," +
			"      \"segments\": [" +
			"        {" +
			"          \"x\": 1500," +
			"          \"y\": 397," +
			"          \"rotation\": -31" +
			"        }," +
			"        {" +
			"          \"x\": 1558," +
			"          \"y\": 363," +
			"          \"rotation\": -31" +
			"        }" +
			"      ]" +
			"    }," +
			"    {" +
			"      \"id\": 65," +
			"      \"doubleID\": 64," +
			"      \"endpoints\":[\"Pittsburgh\", \"New York\"]," +
			"      \"length\":2," +
			"      \"color\": \"white\"," +
			"      \"segments\": [" +
			"        {" +
			"          \"x\": 1488," +
			"          \"y\": 377," +
			"          \"rotation\": -31" +
			"        }," +
			"        {" +
			"          \"x\": 1545," +
			"          \"y\": 342," +
			"          \"rotation\": -31" +
			"        }" +
			"      ]" +
			"    }," +
			"    {" +
			"      \"id\": 66," +
			"      \"doubleID\": 67," +
			"      \"endpoints\":[\"Washington\", \"New York\"]," +
			"      \"length\":2," +
			"      \"color\": \"black\"," +
			"      \"segments\": [" +
			"        {" +
			"          \"x\": 1663," +
			"          \"y\": 350," +
			"          \"rotation\": 87" +
			"        }," +
			"        {" +
			"          \"x\": 1667," +
			"          \"y\": 418," +
			"          \"rotation\": 87" +
			"        }" +
			"      ]" +
			"    }," +
			"    {" +
			"      \"id\": 67," +
			"      \"doubleID\": 66," +
			"      \"endpoints\":[\"Washington\", \"New York\"]," +
			"      \"length\":2," +
			"      \"color\": \"orange\"," +
			"      \"segments\": [" +
			"        {" +
			"          \"x\": 1638," +
			"          \"y\": 351," +
			"          \"rotation\": 87" +
			"        }," +
			"        {" +
			"          \"x\": 1642," +
			"          \"y\": 417," +
			"          \"rotation\": 87" +
			"        }" +
			"      ]" +
			"    }," +
			"    {" +
			"      \"id\": 68," +
			"      \"doubleID\": -1," +
			"      \"endpoints\":[\"Santa Fe\", \"Oklahoma City\"]," +
			"      \"length\":3," +
			"      \"color\": \"blue\"," +
			"      \"segments\": [" +
			"        {" +
			"          \"x\": 679," +
			"          \"y\": 787," +
			"          \"rotation\": -7" +
			"        }," +
			"        {" +
			"          \"x\": 746," +
			"          \"y\": 780," +
			"          \"rotation\": -7" +
			"        }," +
			"        {" +
			"          \"x\": 813," +
			"          \"y\": 771," +
			"          \"rotation\": -7" +
			"        }" +
			"      ]" +
			"    }," +
			"    {" +
			"      \"id\": 69," +
			"      \"doubleID\": -1," +
			"      \"endpoints\":[\"Santa Fe\", \"Phoenix\"]," +
			"      \"length\":3," +
			"      \"color\": \"gray\"," +
			"      \"segments\": [" +
			"        {" +
			"          \"x\": 451," +
			"          \"y\": 871," +
			"          \"rotation\": -24" +
			"        }," +
			"        {" +
			"          \"x\": 513," +
			"          \"y\": 844," +
			"          \"rotation\": -24" +
			"        }," +
			"        {" +
			"          \"x\": 574," +
			"          \"y\": 816," +
			"          \"rotation\": -24" +
			"        }" +
			"      ]" +
			"    }," +
			"    {" +
			"      \"id\": 70," +
			"      \"doubleID\": -1," +
			"      \"endpoints\":[\"Raleigh\", \"Pittsburgh\"]," +
			"      \"length\":2," +
			"      \"color\": \"gray\"," +
			"      \"segments\": [" +
			"        {" +
			"          \"x\": 1501," +
			"          \"y\": 454," +
			"          \"rotation\": 78" +
			"        }," +
			"        {" +
			"          \"x\": 1517," +
			"          \"y\": 520," +
			"          \"rotation\": 78" +
			"        }" +
			"      ]" +
			"    }," +
			"    {" +
			"      \"id\": 71," +
			"      \"doubleID\": -1," +
			"      \"endpoints\":[\"Saint Louis\", \"Pittsburgh\"]," +
			"      \"length\":5," +
			"      \"color\": \"green\"," +
			"      \"segments\": [" +
			"        {" +
			"          \"x\": 1165," +
			"          \"y\": 591," +
			"          \"rotation\": -30" +
			"        }," +
			"        {" +
			"          \"x\": 1223," +
			"          \"y\": 557," +
			"          \"rotation\": -30" +
			"        }," +
			"        {" +
			"          \"x\": 1283," +
			"          \"y\": 524," +
			"          \"rotation\": -30" +
			"        }," +
			"        {" +
			"          \"x\": 1341," +
			"          \"y\": 490," +
			"          \"rotation\": -30" +
			"        }," +
			"        {" +
			"          \"x\": 1400," +
			"          \"y\": 456," +
			"          \"rotation\": -30" +
			"        }" +
			"      ]" +
			"    }," +
			"    {" +
			"      \"id\": 72," +
			"      \"doubleID\": -1," +
			"      \"endpoints\":[\"Toronto\", \"Pittsburgh\"]," +
			"      \"length\":2," +
			"      \"color\": \"gray\"," +
			"      \"segments\": [" +
			"        {" +
			"          \"x\": 1466," +
			"          \"y\": 260," +
			"          \"rotation\": 87" +
			"        }," +
			"        {" +
			"          \"x\": 1470," +
			"          \"y\": 328," +
			"          \"rotation\": 87" +
			"        }" +
			"      ]" +
			"    }," +
			"    {" +
			"      \"id\": 73," +
			"      \"doubleID\": -1," +
			"      \"endpoints\":[\"Washington\", \"Pittsburgh\"]," +
			"      \"length\":2," +
			"      \"color\": \"gray\"," +
			"      \"segments\": [" +
			"        {" +
			"          \"x\": 1509," +
			"          \"y\": 423," +
			"          \"rotation\": 27" +
			"        }," +
			"        {" +
			"          \"x\": 1569," +
			"          \"y\": 454," +
			"          \"rotation\": 27" +
			"        }" +
			"      ]" +
			"    }," +
			"    {" +
			"      \"id\": 74," +
			"      \"doubleID\": -1," +
			"      \"endpoints\":[\"Salt Lake City\", \"Portland\"]," +
			"      \"length\":6," +
			"      \"color\": \"blue\"," +
			"      \"segments\": [" +
			"        {" +
			"          \"x\": 105," +
			"          \"y\": 315," +
			"          \"rotation\": 11" +
			"        }," +
			"        {" +
			"          \"x\": 172," +
			"          \"y\": 330," +
			"          \"rotation\": 18" +
			"        }," +
			"        {" +
			"          \"x\": 236," +
			"          \"y\": 355," +
			"          \"rotation\": 25" +
			"        }," +
			"        {" +
			"          \"x\": 293," +
			"          \"y\": 393," +
			"          \"rotation\": 37" +
			"        }," +
			"        {" +
			"          \"x\": 346," +
			"          \"y\": 437," +
			"          \"rotation\": 46" +
			"        }," +
			"        {" +
			"          \"x\": 391," +
			"          \"y\": 489," +
			"          \"rotation\": 59" +
			"        }" +
			"      ]" +
			"    }," +
			"    {" +
			"      \"id\": 75," +
			"      \"doubleID\": 76," +
			"      \"endpoints\":[\"Washington\", \"Raleigh\"]," +
			"      \"length\":2," +
			"      \"color\": \"gray\"," +
			"      \"segments\": [" +
			"        {" +
			"          \"x\": 1558," +
			"          \"y\": 612," +
			"          \"rotation\": -52" +
			"        }," +
			"        {" +
			"          \"x\": 1602," +
			"          \"y\": 560," +
			"          \"rotation\": -52" +
			"        }" +
			"      ]" +
			"    }," +
			"    {" +
			"      \"id\": 76," +
			"      \"doubleID\": 75," +
			"      \"endpoints\":[\"Washington\", \"Raleigh\"]," +
			"      \"length\":2," +
			"      \"color\": \"gray\"," +
			"      \"segments\": [" +
			"        {" +
			"          \"x\": 1541," +
			"          \"y\": 597," +
			"          \"rotation\": -52" +
			"        }," +
			"        {" +
			"          \"x\": 1584," +
			"          \"y\": 545," +
			"          \"rotation\": -52" +
			"        }" +
			"      ]" +
			"    }," +
			"    {" +
			"      \"id\": 77," +
			"      \"doubleID\": 78," +
			"      \"endpoints\":[\"San Francisco\", \"Salt Lake City\"]," +
			"      \"length\":5," +
			"      \"color\": \"orange\"," +
			"      \"segments\": [" +
			"        {" +
			"          \"x\": 81," +
			"          \"y\": 656," +
			"          \"rotation\": -18" +
			"        }," +
			"        {" +
			"          \"x\": 144," +
			"          \"y\": 635," +
			"          \"rotation\": -18" +
			"        }," +
			"        {" +
			"          \"x\": 206," +
			"          \"y\": 614," +
			"          \"rotation\": -18" +
			"        }," +
			"        {" +
			"          \"x\": 271," +
			"          \"y\": 593," +
			"          \"rotation\": -18" +
			"        }," +
			"        {" +
			"          \"x\": 332," +
			"          \"y\": 572," +
			"          \"rotation\": -18" +
			"        }" +
			"      ]" +
			"    }," +
			"    {" +
			"      \"id\": 78," +
			"      \"doubleID\": 77," +
			"      \"endpoints\":[\"San Francisco\", \"Salt Lake City\"]," +
			"      \"length\":5," +
			"      \"color\": \"white\"," +
			"      \"segments\": [" +
			"        {" +
			"          \"x\": 89," +
			"          \"y\": 678," +
			"          \"rotation\": -18" +
			"        }," +
			"        {" +
			"          \"x\": 152," +
			"          \"y\": 657," +
			"          \"rotation\": -18" +
			"        }," +
			"        {" +
			"          \"x\": 214," +
			"          \"y\": 636," +
			"          \"rotation\": -18" +
			"        }," +
			"        {" +
			"          \"x\": 277," +
			"          \"y\": 615," +
			"          \"rotation\": -18" +
			"        }," +
			"        {" +
			"          \"x\": 340," +
			"          \"y\": 594," +
			"          \"rotation\": -18" +
			"        }" +
			"      ]" +
			"    }," +
			"    {" +
			"      \"id\": 79," +
			"      \"doubleID\": -1," +
			"      \"endpoints\":[\"Toronto\", \"Sault Ste. Marie\"]," +
			"      \"length\":2," +
			"      \"color\": \"gray\"," +
			"      \"segments\": [" +
			"        {" +
			"          \"x\": 1273," +
			"          \"y\": 195," +
			"          \"rotation\": 12" +
			"        }," +
			"        {" +
			"          \"x\": 1339," +
			"          \"y\": 209," +
			"          \"rotation\": 12" +
			"        }" +
			"      ]" +
			"    }," +
			"    {" +
			"      \"id\": 80," +
			"      \"doubleID\": -1," +
			"      \"endpoints\":[\"Winnipeg\", \"Sault Ste. Marie\"]," +
			"      \"length\":6," +
			"      \"color\": \"gray\"," +
			"      \"segments\": [" +
			"        {" +
			"          \"x\": 831," +
			"          \"y\": 96," +
			"          \"rotation\": 12" +
			"        }," +
			"        {" +
			"          \"x\": 897," +
			"          \"y\": 110," +
			"          \"rotation\": 12" +
			"        }," +
			"        {" +
			"          \"x\": 963," +
			"          \"y\": 123," +
			"          \"rotation\": 12" +
			"        }," +
			"        {" +
			"          \"x\": 1029," +
			"          \"y\": 137," +
			"          \"rotation\": 12" +
			"        }," +
			"        {" +
			"          \"x\": 1094," +
			"          \"y\": 151," +
			"          \"rotation\": 12" +
			"        }," +
			"        {" +
			"          \"x\": 1160," +
			"          \"y\": 164," +
			"          \"rotation\": 12" +
			"        }" +
			"      ]" +
			"    }," +
			"    {" +
			"      \"id\": 81," +
			"      \"doubleID\": -1," +
			"      \"endpoints\":[\"Seattle\", \"Calgary\"]," +
			"      \"length\":4," +
			"      \"color\": \"gray\"," +
			"      \"segments\": [" +
			"        {" +
			"          \"x\": 145," +
			"          \"y\": 210," +
			"          \"rotation\": 0" +
			"        }," +
			"        {" +
			"          \"x\": 212," +
			"          \"y\": 211," +
			"          \"rotation\": -7" +
			"        }," +
			"        {" +
			"          \"x\": 278," +
			"          \"y\": 200," +
			"          \"rotation\": -38" +
			"        }," +
			"        {" +
			"          \"x\": 330," +
			"          \"y\": 159," +
			"          \"rotation\": -64" +
			"        }" +
			"      ]" +
			"    }," +
			"    {" +
			"      \"id\": 82," +
			"      \"doubleID\": -1," +
			"      \"endpoints\":[\"Vancouver\", \"Calgary\"]," +
			"      \"length\":3," +
			"      \"color\": \"gray\"," +
			"      \"segments\": [" +
			"        {" +
			"          \"x\": 150," +
			"          \"y\": 102," +
			"          \"rotation\": -7" +
			"        }," +
			"        {" +
			"          \"x\": 217," +
			"          \"y\": 94," +
			"          \"rotation\": -7" +
			"        }," +
			"        {" +
			"          \"x\": 284," +
			"          \"y\": 87," +
			"          \"rotation\": -7" +
			"        }" +
			"      ]" +
			"    }," +
			"    {" +
			"      \"id\": 83," +
			"      \"doubleID\": 82," +
			"      \"endpoints\":[\"San Francisco\", \"Portland\"]," +
			"      \"length\":5," +
			"      \"color\": \"green\"," +
			"      \"segments\": [" +
			"        {" +
			"          \"x\": 65," +
			"          \"y\": 340," +
			"          \"rotation\": 113" +
			"        }," +
			"        {" +
			"          \"x\": 40," +
			"          \"y\": 402," +
			"          \"rotation\": 102" +
			"        }," +
			"        {" +
			"          \"x\": 27," +
			"          \"y\": 466," +
			"          \"rotation\": 92" +
			"        }," +
			"        {" +
			"          \"x\": 25," +
			"          \"y\": 534," +
			"          \"rotation\": 84" +
			"        }," +
			"        {" +
			"          \"x\": 30," +
			"          \"y\": 600," +
			"          \"rotation\": 73" +
			"        }" +
			"      ]" +
			"    }," +
			"    {" +
			"      \"id\": 84," +
			"      \"doubleID\": 83," +
			"      \"endpoints\":[\"San Francisco\", \"Portland\"]," +
			"      \"length\":5," +
			"      \"color\": \"pink\"," +
			"      \"segments\": [" +
			"        {" +
			"          \"x\": 92," +
			"          \"y\": 343," +
			"          \"rotation\": 113" +
			"        }," +
			"        {" +
			"          \"x\": 67," +
			"          \"y\": 406," +
			"          \"rotation\": 102" +
			"        }," +
			"        {" +
			"          \"x\": 54," +
			"          \"y\": 470," +
			"          \"rotation\": 92" +
			"        }," +
			"        {" +
			"          \"x\": 52," +
			"          \"y\": 537," +
			"          \"rotation\": 84" +
			"        }," +
			"        {" +
			"          \"x\": 57," +
			"          \"y\": 603," +
			"          \"rotation\": 73" +
			"        }" +
			"      ]" +
			"    }," +
			"    {" +
			"      \"id\": 85," +
			"      \"doubleID\": 86," +
			"      \"endpoints\":[\"Seattle\", \"Portland\"]," +
			"      \"length\":1," +
			"      \"color\": \"gray\"," +
			"      \"segments\": [" +
			"        {" +
			"          \"x\": 104," +
			"          \"y\": 239," +
			"          \"rotation\": 113" +
			"        }" +
			"      ]" +
			"    }," +
			"    {" +
			"      \"id\": 86," +
			"      \"doubleID\": 85," +
			"      \"endpoints\":[\"Seattle\", \"Portland\"]," +
			"      \"length\":1," +
			"      \"color\": \"gray\"," +
			"      \"segments\": [" +
			"        {" +
			"          \"x\": 125," +
			"          \"y\":248," +
			"          \"rotation\": 113" +
			"        }" +
			"      ]" +
			"    }," +
			"    {" +
			"      \"id\": 87," +
			"      \"doubleID\": 88," +
			"      \"endpoints\":[\"San Francisco\", \"Los Angeles\"]," +
			"      \"length\":3," +
			"      \"color\": \"pink\"," +
			"      \"segments\": [" +
			"        {" +
			"          \"x\": 80," +
			"          \"y\": 699," +
			"          \"rotation\": 65" +
			"        }," +
			"        {" +
			"          \"x\": 108," +
			"          \"y\": 760," +
			"          \"rotation\": 54" +
			"        }," +
			"        {" +
			"          \"x\": 147," +
			"          \"y\": 814," +
			"          \"rotation\": 45" +
			"        }" +
			"      ]" +
			"    }," +
			"    {" +
			"      \"id\": 88," +
			"      \"doubleID\": 87," +
			"      \"endpoints\":[\"San Francisco\", \"Los Angeles\"]," +
			"      \"length\":3," +
			"      \"color\": \"yellow\"," +
			"      \"segments\": [" +
			"        {" +
			"          \"x\":62," +
			"          \"y\":712," +
			"          \"rotation\": 65" +
			"        }," +
			"        {" +
			"          \"x\": 89," +
			"          \"y\": 773," +
			"          \"rotation\": 54" +
			"        }," +
			"        {" +
			"          \"x\": 127," +
			"          \"y\": 827," +
			"          \"rotation\": 45" +
			"        }" +
			"      ]" +
			"    }," +
			"    {" +
			"      \"id\": 89," +
			"      \"doubleID\": 90," +
			"      \"endpoints\":[\"Vancouver\", \"Seattle\"]," +
			"      \"length\":1," +
			"      \"color\": \"gray\"," +
			"      \"segments\": [" +
			"        {" +
			"          \"x\": 115," +
			"          \"y\": 142," +
			"          \"rotation\": 90" +
			"        }" +
			"      ]" +
			"    }," +
			"    {" +
			"      \"id\": 90," +
			"      \"doubleID\": 89," +
			"      \"endpoints\":[\"Vancouver\", \"Seattle\"]," +
			"      \"length\":1," +
			"      \"color\": \"gray\"," +
			"      \"segments\": [" +
			"        {" +
			"          \"x\": 139," +
			"          \"y\": 141," +
			"          \"rotation\": 90" +
			"        }" +
			"      ]" +
			"    }," +
			"    {" +
			"      \"id\": 91," +
			"      \"doubleID\": -1," +
			"      \"endpoints\":[\"Charleston\", \"Atlanta\"]," +
			"      \"length\":2," +
			"      \"color\": \"gray\"," +
			"      \"segments\":[" +
			"        {" +
			"          \"x\": 1445," +
			"          \"y\": 744," +
			"          \"rotation\": 4" +
			"        }," +
			"        {" +
			"          \"x\": 1513," +
			"          \"y\": 747," +
			"          \"rotation\": 4" +
			"        }" +
			"      ]" +
			"    }," +
			"    {" +
			"      \"id\": 92," +
			"      \"doubleID\": -1," +
			"      \"endpoints\":[\"Miami\", \"Atlanta\"]," +
			"      \"length\":5," +
			"      \"color\": \"blue\"," +
			"      \"segments\":[" +
			"        {" +
			"          \"x\": 1432," +
			"          \"y\": 760," +
			"          \"rotation\": 48" +
			"        }," +
			"        {" +
			"          \"x\": 1474," +
			"          \"y\": 813," +
			"          \"rotation\": 48" +
			"        }," +
			"        {" +
			"          \"x\": 1516," +
			"          \"y\": 866," +
			"          \"rotation\": 48" +
			"        }," +
			"        {" +
			"          \"x\": 1559," +
			"          \"y\": 918," +
			"          \"rotation\": 48" +
			"        }," +
			"        {" +
			"          \"x\": 1601," +
			"          \"y\": 971," +
			"          \"rotation\": 48" +
			"        }" +
			"      ]" +
			"    }," +
			"    {" +
			"      \"id\": 93," +
			"      \"doubleID\": -1," +
			"      \"endpoints\":[\"Nashville\", \"Atlanta\"]," +
			"      \"length\":1," +
			"      \"color\": \"gray\"," +
			"      \"segments\": [" +
			"        {" +
			"          \"x\": 1343," +
			"          \"y\": 673," +
			"          \"rotation\": 25" +
			"        }" +
			"      ]" +
			"    }," +
			"    {" +
			"      \"id\": 94," +
			"      \"doubleID\": 95," +
			"      \"endpoints\":[\"New Orleans\", \"Atlanta\"]," +
			"      \"length\":4," +
			"      \"color\": \"yellow\"," +
			"      \"segments\": [" +
			"        {" +
			"          \"x\": 1234," +
			"          \"y\": 942," +
			"          \"rotation\": -74" +
			"        }," +
			"        {" +
			"          \"x\": 1260," +
			"          \"y\": 878," +
			"          \"rotation\": -66" +
			"        }," +
			"        {" +
			"          \"x\": 1299," +
			"          \"y\": 820," +
			"          \"rotation\": -58" +
			"        }," +
			"        {" +
			"          \"x\": 1344," +
			"          \"y\": 768," +
			"          \"rotation\": -40" +
			"        }" +
			"      ]" +
			"    }," +
			"    {" +
			"      \"id\": 95," +
			"      \"doubleID\": 94," +
			"      \"endpoints\":[\"New Orleans\", \"Atlanta\"]," +
			"      \"length\":4," +
			"      \"color\": \"orange\"," +
			"      \"segments\": [" +
			"        {" +
			"          \"x\": 1251," +
			"          \"y\": 958," +
			"          \"rotation\": -74" +
			"        }," +
			"        {" +
			"          \"x\": 1277," +
			"          \"y\": 895," +
			"          \"rotation\": -66" +
			"        }," +
			"        {" +
			"          \"x\": 1316," +
			"          \"y\": 838," +
			"          \"rotation\": -58" +
			"        }," +
			"        {" +
			"          \"x\": 1360," +
			"          \"y\": 786," +
			"          \"rotation\": -40" +
			"        }" +
			"      ]" +
			"    }," +
			"    {" +
			"      \"id\": 96," +
			"      \"doubleID\": 97," +
			"      \"endpoints\":[\"Raleigh\", \"Atlanta\"]," +
			"      \"length\":2," +
			"      \"color\": \"gray\"," +
			"      \"segments\": [" +
			"        {" +
			"          \"x\": 1417," +
			"          \"y\": 704," +
			"          \"rotation\": -38" +
			"        },{" +
			"          \"x\": 1468," +
			"          \"y\": 660," +
			"          \"rotation\": -38" +
			"        }" +
			"      ]" +
			"    }," +
			"    {" +
			"      \"id\": 97," +
			"      \"doubleID\": 96," +
			"      \"endpoints\":[\"Raleigh\", \"Atlanta\"]," +
			"      \"length\":2," +
			"      \"color\": \"gray\"," +
			"      \"segments\": [" +
			"        {" +
			"          \"x\": 1432," +
			"          \"y\": 721," +
			"          \"rotation\": -42" +
			"        },{" +
			"          \"x\": 1483," +
			"          \"y\": 677," +
			"          \"rotation\": -42" +
			"        }" +
			"      ]" +
			"    }," +
			"    {" +
			"      \"id\": 98," +
			"      \"doubleID\": 99," +
			"      \"endpoints\":[\"Montreal\", \"Boston\"]," +
			"      \"length\":2," +
			"      \"color\": \"gray\"," +
			"      \"segments\": [" +
			"        {" +
			"          \"x\": 1631," +
			"          \"y\": 77," +
			"          \"rotation\": 38" +
			"        }," +
			"        {" +
			"          \"x\": 1683," +
			"          \"y\": 119," +
			"          \"rotation\": 38" +
			"        }" +
			"      ]" +
			"    }," +
			"    {" +
			"      \"id\": 99," +
			"      \"doubleID\": 98," +
			"      \"endpoints\":[\"Montreal\", \"Boston\"]," +
			"      \"length\":2," +
			"      \"color\": \"gray\"," +
			"      \"segments\": [" +
			"        {" +
			"          \"x\": 1616," +
			"          \"y\": 95," +
			"          \"rotation\": 38" +
			"        }," +
			"        {" +
			"          \"x\": 1668," +
			"          \"y\": 138," +
			"          \"rotation\": 38" +
			"        }" +
			"      ]" +
			"    }" +
			"  ]," +
			"  \"TrainCards\":[" +
			"    {\"color\": \"blue\", \"count\": 12}," +
			"    {\"color\": \"green\", \"count\": 12}," +
			"    {\"color\": \"pink\", \"count\": 12}," +
			"    {\"color\": \"red\", \"count\": 12}," +
			"    {\"color\": \"yellow\", \"count\": 12}," +
			"    {\"color\": \"black\", \"count\": 12}," +
			"    {\"color\": \"orange\", \"count\": 12}," +
			"    {\"color\": \"white\", \"count\": 12}," +
			"    {\"color\": \"gold\", \"count\": 14}" +
			"  ]," +
			"  \"DestinationCards\":[" +
			"    {" +
			"      \"endpoints\":[\"Los Angeles\", \"New York\"]," +
			"      \"points\": 21" +
			"    }," +
			"    {" +
			"      \"endpoints\":[\"Duluth\", \"Houston\"]," +
			"      \"points\": 8" +
			"    }," +
			"    {" +
			"      \"endpoints\":[\"Sault Ste. Marie\", \"Nashville\"]," +
			"      \"points\": 8" +
			"    }," +
			"    {" +
			"      \"endpoints\":[\"New York\", \"Atlanta\"]," +
			"      \"points\": 6" +
			"    }," +
			"    {" +
			"      \"endpoints\":[\"Portland\", \"Nashville\"]," +
			"      \"points\": 17" +
			"    }," +
			"    {" +
			"      \"endpoints\":[\"Vancouver\", \"Montreal\"]," +
			"      \"points\": 20" +
			"    }," +
			"    {" +
			"      \"endpoints\":[\"Duluth\", \"El Paso\"]," +
			"      \"points\": 10" +
			"    }," +
			"    {" +
			"      \"endpoints\":[\"Toronto\", \"Miami\"]," +
			"      \"points\": 10" +
			"    }," +
			"    {" +
			"      \"endpoints\":[\"Portland\", \"Phoenix\"]," +
			"      \"points\": 11" +
			"    }," +
			"    {" +
			"      \"endpoints\":[\"Dallas\", \"New York\"]," +
			"      \"points\": 11" +
			"    }," +
			"    {" +
			"      \"endpoints\":[\"Calgary\", \"Salt Lake City\"]," +
			"      \"points\": 7" +
			"    }," +
			"    {" +
			"      \"endpoints\":[\"Calgary\", \"Phoenix\"]," +
			"      \"points\": 13" +
			"    }," +
			"    {" +
			"      \"endpoints\":[\"Los Angeles\", \"Miami\"]," +
			"      \"points\": 20" +
			"    }," +
			"    {" +
			"      \"endpoints\":[\"Winnipeg\", \"Little Rock\"]," +
			"      \"points\": 11" +
			"    }," +
			"    {" +
			"      \"endpoints\":[\"San Francisco\", \"Atlanta\"]," +
			"      \"points\": 17" +
			"    }," +
			"    {" +
			"      \"endpoints\":[\"Kansas City\", \"Houston\"]," +
			"      \"points\": 5" +
			"    }," +
			"    {" +
			"      \"endpoints\":[\"Los Angeles\", \"Chicago\"]," +
			"      \"points\": 16" +
			"    }," +
			"    {" +
			"      \"endpoints\":[\"Denver\", \"Pittsburgh\"]," +
			"      \"points\": 11" +
			"    }," +
			"    {" +
			"      \"endpoints\":[\"Chicago\", \"Santa Fe\"]," +
			"      \"points\": 9" +
			"    }," +
			"    {" +
			"      \"endpoints\":[\"Vancouver\", \"Santa Fe\"]," +
			"      \"points\": 13" +
			"    }," +
			"    {" +
			"      \"endpoints\":[\"Boston\", \"Miami\"]," +
			"      \"points\": 12" +
			"    }," +
			"    {" +
			"      \"endpoints\":[\"Chicago\", \"New Orleans\"]," +
			"      \"points\": 7" +
			"    }," +
			"    {" +
			"      \"endpoints\":[\"Montreal\", \"Atlanta\"]," +
			"      \"points\": 9" +
			"    }," +
			"    {" +
			"      \"endpoints\":[\"Seattle\", \"New York\"]," +
			"      \"points\": 22" +
			"    }," +
			"    {" +
			"      \"endpoints\":[\"Denver\", \"El Paso\"]," +
			"      \"points\": 4" +
			"    }," +
			"    {" +
			"      \"endpoints\":[\"Helena\", \"Los Angeles\"]," +
			"      \"points\": 8" +
			"    }," +
			"    {" +
			"      \"endpoints\":[\"Winnipeg\", \"Houston\"]," +
			"      \"points\": 12" +
			"    }," +
			"    {" +
			"      \"endpoints\":[\"Montreal\", \"New Orleans\"]," +
			"      \"points\": 13" +
			"    }," +
			"    {" +
			"      \"endpoints\":[\"Sault Ste. Marie\", \"Oklahoma City\"]," +
			"      \"points\": 9" +
			"    }," +
			"    {" +
			"      \"endpoints\":[\"Seattle\", \"Los Angeles\"]," +
			"      \"points\": 9" +
			"    }" +
			"  ]" +
			"}";
}