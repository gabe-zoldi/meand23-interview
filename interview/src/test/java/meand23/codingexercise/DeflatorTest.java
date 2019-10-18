package meand23.codingexercise;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class DeflatorTest {

    @DataProvider(name = "checkInputs")
    public Object[][] dataProviderMethod() {
        return new Object[][] {
                // input            expectedOutput
                { "abc",            "abc"      },
                { "aabbcc",         "a2b2c2"   },
                { "abbbcc",         "ab3c2"    },
                { "abcabc",         "abcabc"   },
                { "bbbaaabbbaaa",   "b3a3b3a3" },

                // additional tests
                { "",               ""            },
                { null,             null          },
                { "  ",             " 2"          },
                { "cba",            "cba"         },
                { "ccbbba",         "c2b3a"       },
                { "a",              "a"           },
                { "aaa",            "a3"          },
                { "ab3c2",          "ab3c2"       },
                { "a!@@$bbb  cc",   "a!@2$b3 2c2" },
                { "b\\n\\r\\t",     "b\\n\\r\\t"  }
        };
    }

    @Test(dataProvider = "checkInputs")
    public void tryDifferentInputs(String input, String expectedOutput) {
        String actual = new Deflator().compress(input);
        assertThat(actual, is(expectedOutput));
    }

}