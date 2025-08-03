package OCP;

import java.util.List;

interface DiscountPolicy  {
    boolean supports(String memberType);
    int getDiscountRate();
}

class RegularDiscountPolicy implements DiscountPolicy {

    @Override
    public boolean supports(String memberType) {
        return "Regular".equals(memberType);
    }

    @Override
    public int getDiscountRate() {
        return 5;
    }
}

class VipDiscountPolicy implements DiscountPolicy {

    @Override
    public boolean supports(String memberType) {
        return "VIP".equals(memberType);
    }

    @Override
    public int getDiscountRate() {
        return 20;
    }
}

public class DiscountServiceOCP {
    private final List<DiscountPolicy> policies;

    public DiscountServiceOCP(List<DiscountPolicy> policies) {
        this.policies = policies;
    }

    public int getDiscountRate(String memberType) {
        return policies.stream()
                .filter(p -> p.supports(memberType))
                .findFirst()
                .map(DiscountPolicy::getDiscountRate)
                .orElse(0);
    }
}