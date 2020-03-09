package stormbreaker.optional;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.StringJoiner;

public class OptionalDemoOrElse {
    public static void main(String[] args) {
        Optional<String> abc = getOptionalString();
        Optional<String> xyz = Optional.empty();
        System.out.println(abc.orElse("Vikash"));
        System.out.println(xyz.isPresent());
        System.out.println("He'llo Vika\'sh");
        System.out.println(new StringJoiner("/").add(null).add(abc.get()));
        BigDecimal val = new BigDecimal("0.000000");
        int flag = val.compareTo(BigDecimal.ZERO);
        System.out.println(val);
        System.out.println(flag);
    }

    static Optional<String> getOptionalString() {
        return Optional.of("HelloWorld");
    }
}
