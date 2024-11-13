package kr.or.ddit.lab03.objs;

import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

@RequiredArgsConstructor
@Setter
@Component
public class HuntingGroundMission {

    private List<Hunter> hunterList;
    private HuntingDog huntingDog;
    private final Set<Shotgun> gunSet;
}
