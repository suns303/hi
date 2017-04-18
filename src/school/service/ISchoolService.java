package school.service;

import school.model.NameId;
import school.model.School;

import java.util.List;

/**
 * Created by danawacomputer on 2017-04-12.
 */
public interface ISchoolService {

    List<School> schoolNameReset(List<School> list);

    List<NameId> nameIdReset(List<School> list);
}
