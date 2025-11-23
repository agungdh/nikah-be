package id.my.agungdh.nikahbe.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class RencanaKehadiran {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, updatable = false)
    private UUID uuid;

    private String nama;
    private String alamat;
    private boolean statusKehadiran;

    @Column(nullable = false, updatable = false)
    private long createdAt;

    @PrePersist
    public void prePersist() {
        if (uuid == null) {
            uuid = UUID.randomUUID();
        }
        this.createdAt = System.currentTimeMillis();
    }
}
