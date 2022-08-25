package NhsBsa.utilities;

import NhsBsa.pages.*;

public class Pages {
    GenericFunctions genericFunctions;
    CheckCostsNHS checkCostsNHS;




    public GenericFunctions genericFunctions() {
        if (genericFunctions == null) {
            genericFunctions = new GenericFunctions();
        }
        return genericFunctions;
    }
    public CheckCostsNHS checkCostsNHS() {
        if (checkCostsNHS == null) {
            checkCostsNHS = new CheckCostsNHS();
        }
        return checkCostsNHS;
    }


}
