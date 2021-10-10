import by.shumkov.onlineShopby.entity.Phone;
import by.shumkov.onlineShopby.repository.PhoneRepository;
import by.shumkov.onlineShopby.service.PhoneService;
import by.shumkov.onlineShopby.service.impl.PhoneServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public class PhoneServiceTest {

    @Test
    public void serviceShouldHaveListOsPhone() {
        //action


        PhoneService phoneService = new PhoneServiceImpl(new PhoneRepository() {
            @Override
            public List<Phone> findPhoneByNameIsLike(String name) {
                return null;
            }

            @Override
            public Optional<Phone> findPhoneByName(String name) {
                return Optional.empty();
            }

            @Override
            public List<Phone> findAll() {
                return null;
            }

            @Override
            public List<Phone> findAll(Sort sort) {
                return null;
            }

            @Override
            public List<Phone> findAllById(Iterable<Integer> iterable) {
                return null;
            }

            @Override
            public <S extends Phone> List<S> saveAll(Iterable<S> iterable) {
                return null;
            }

            @Override
            public void flush() {

            }

            @Override
            public <S extends Phone> S saveAndFlush(S s) {
                return null;
            }

            @Override
            public void deleteInBatch(Iterable<Phone> iterable) {

            }

            @Override
            public void deleteAllInBatch() {

            }

            @Override
            public Phone getOne(Integer integer) {
                return null;
            }

            @Override
            public <S extends Phone> List<S> findAll(Example<S> example) {
                return null;
            }

            @Override
            public <S extends Phone> List<S> findAll(Example<S> example, Sort sort) {
                return null;
            }

            @Override
            public Page<Phone> findAll(Pageable pageable) {
                return null;
            }

            @Override
            public <S extends Phone> S save(S s) {
                return null;
            }

            @Override
            public Optional<Phone> findById(Integer integer) {
                return Optional.empty();
            }

            @Override
            public boolean existsById(Integer integer) {
                return false;
            }

            @Override
            public long count() {
                return 0;
            }

            @Override
            public void deleteById(Integer integer) {

            }

            @Override
            public void delete(Phone phone) {

            }

            @Override
            public void deleteAll(Iterable<? extends Phone> iterable) {

            }

            @Override
            public void deleteAll() {

            }

            @Override
            public <S extends Phone> Optional<S> findOne(Example<S> example) {
                return Optional.empty();
            }

            @Override
            public <S extends Phone> Page<S> findAll(Example<S> example, Pageable pageable) {
                return null;
            }

            @Override
            public <S extends Phone> long count(Example<S> example) {
                return 0;
            }

            @Override
            public <S extends Phone> boolean exists(Example<S> example) {
                return false;
            }
        });
        //assertion
        Assert.assertEquals(null, phoneService.findAllPhone(null), 1e-9);

    }

}
