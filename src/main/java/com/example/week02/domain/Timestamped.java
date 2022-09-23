package com.example.week02.domain;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass // 상속했을 때, 컬럼으로 인식하게 합니다.
@EntityListeners(AuditingEntityListener.class) // 생성/수정 시간을 자동으로 반영하도록 설정

//abstract: 직접 구현 안된다, 상속으로만 쓸 수 있다.
//ex) new Timestamped(); 사용 안됨. ->extends Timestamped와 같이 사용 가능
public abstract class Timestamped {

    //@~~~: 골뱅이 붙은것은 어노테이션이라고 한다.
    @CreatedDate // 생성일자임을 나타냅니다.
    private LocalDateTime createdAt;

    @LastModifiedDate // 마지막 수정일자임을 나타냅니다.
    private LocalDateTime modifiedAt;
}