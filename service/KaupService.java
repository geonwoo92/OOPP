package service;

import model.Member;

public interface KaupService {
    public String createBMI(Member mem);
    public String createBodyMass(String bmi);

}
