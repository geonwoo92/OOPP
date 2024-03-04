package serviceImpl;

import model.Member;
import service.KaupService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KaupServiceImpl implements KaupService {

    private static KaupService instance = new KaupServiceImpl();

    Map<?,?> kaupMap;
    List<?> kaupList;

    private KaupServiceImpl() {
        this.kaupMap = new HashMap<>();
        this.kaupList = new ArrayList<>();
    }

    public static KaupService getInstance() {
        return instance;
    }

    @java.lang.Override
    public String createBMI(Member mem) {
        double height = mem.getHeight()/100;
        double weight = mem.getWeight();
        double bmi = 0.0;
        bmi = weight / ((height)*(height));
        return String.valueOf(bmi);
    }

    @java.lang.Override
    public String createBodyMass(String bmi) {
        double bmiDouble = Double.parseDouble(bmi);
        String result = "";
        return bmi;

    }
}
