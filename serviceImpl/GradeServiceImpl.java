package serviceImpl;

import model.Subject;
import service.GradeService;

public class GradeServiceImpl implements GradeService {
    private static GradeService instance = new GradeServiceImpl();

    private GradeServiceImpl() {
    }

    public static GradeService getInstance() {
        return instance;
    }

    @Override
    public int getSum(Subject sub) {
        int k = sub.getKorean();
        int e = sub.getEnglish();
        int m = sub.getMath();
        int sumsum = 0;
        sumsum = k+e+m;
        return sumsum;
    }

    @Override
    public double getAvg(int sumsum) {
        double avgavg = (Math.round(sumsum*100)/100.0) / 3;
        return avgavg;
    }
}
