package rozdzial2.zajecia6.lombok;

import lombok.*;

import java.util.List;

@ToString
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Kurs {
    private String nazwa;
    private String lokalizacja;

    @Singular("studentList")
    private List<Student> studentList;
}
