    package com.iim.springboot.service;

    import com.iim.springboot.model.Forgeron;
    import com.iim.springboot.model.metaux.Fer;
    import com.iim.springboot.model.metaux.Or;
    import com.iim.springboot.repository.FerRepository;
    import com.iim.springboot.repository.ForgeronRepository;
    import com.iim.springboot.repository.OrRepository;
    import org.springframework.stereotype.Service;
    import org.springframework.transaction.annotation.Transactional;

    import java.util.Objects;

    @Service
    public class ForgeronService {

        private final ForgeronRepository repository;
        private final FerRepository ferRepository;
        private final OrRepository orRepository;

        public ForgeronService(
                ForgeronRepository repository,
                FerRepository ferRepository,
                OrRepository orRepository
        ) {
            this.repository = repository;
            this.ferRepository = ferRepository;
            this.orRepository = orRepository;
        }

        public Forgeron create(String nom, int maitrise) {
            Forgeron forgeron = new Forgeron(nom, maitrise);
            return repository.save(forgeron);
        }

        public Forgeron getById(Long id) {
            return repository.findById(id).get();
        }


        // Fonte des Metaux
        @Transactional
        public Long fonte(Long id, String type) {
            if (Objects.equals(type, "fer")) {
                return (long) ferRepository.updateForme(id, "liquide");
            } else if (Objects.equals(type, "or")) {
                return (long) orRepository.updateForme(id, "liquide");
            } else {
                throw new IllegalArgumentException("Type de métal inconnu : " + type);
            }
        }

        // forger des Metaux
        @Transactional
        public Long forge(Long id, String type, String forme) {
            if (Objects.equals(type, "fer")) {
                Fer analyseForme = ferRepository.findById(id).orElse(null);
                if (analyseForme != null &&
                        Objects.equals(analyseForme.forme, "liquide")) {
                    return (long) ferRepository.updateForme(id, forme);
                }
                return 0L;
            } else if (Objects.equals(type, "or")) {
                Or analyseForme = orRepository.findById(id).orElse(null);
                if (analyseForme != null &&
                        Objects.equals(analyseForme.forme, "liquide")) {
                    return (long) orRepository.updateForme(id, forme);
                }
                return 0L;
            } else {
                return 0L;
            }
        }

    }