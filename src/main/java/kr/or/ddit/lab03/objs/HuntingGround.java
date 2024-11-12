package kr.or.ddit.lab03.objs;

import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.Month;
import java.util.List;
import java.util.Map;
import java.util.Set;


@RequiredArgsConstructor
@ToString
@Setter
public class HuntingGround {

    private final Month month;
    private final Map<String, HuntingDog> dogMap;
    private List<Hunter> hunterList;
    private final Set<Shotgun> gunSet;
}
