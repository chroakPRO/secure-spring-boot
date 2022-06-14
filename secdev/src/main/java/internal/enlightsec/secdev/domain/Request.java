package internal.enlightsec.secdev.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import internal.enlightsec.secdev.domain.enumDomain.*;

import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Request {
    private Long id;
    private String name;
    private RequestType requestType;
    private HTTPVerb httpVerb;
}

