package com.PODownload.Consumer.service;

import com.PODownload.Consumer.model.POModel;
import com.PODownload.Consumer.repository.PORepository;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class MessageListener {

    public PORepository poRepository=new PORepository() {
        @Override
        public List<POModel> findAll() {
            return null;
        }

        @Override
        public List<POModel> findAll(Sort sort) {
            return null;
        }

        @Override
        public List<POModel> findAllById(Iterable<Integer> iterable) {
            return null;
        }

        @Override
        public <S extends POModel> List<S> saveAll(Iterable<S> iterable) {
            return null;
        }

        @Override
        public void flush() {

        }

        @Override
        public <S extends POModel> S saveAndFlush(S s) {
            return null;
        }

        @Override
        public void deleteInBatch(Iterable<POModel> iterable) {

        }

        @Override
        public void deleteAllInBatch() {

        }

        @Override
        public POModel getOne(Integer integer) {
            return null;
        }

        @Override
        public <S extends POModel> List<S> findAll(Example<S> example) {
            return null;
        }

        @Override
        public <S extends POModel> List<S> findAll(Example<S> example, Sort sort) {
            return null;
        }

        @Override
        public Page<POModel> findAll(Pageable pageable) {
            return null;
        }

        @Override
        public <S extends POModel> S save(S s) {
            return null;
        }

        @Override
        public Optional<POModel> findById(Integer integer) {
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
        public void delete(POModel poModel) {

        }

        @Override
        public void deleteAll(Iterable<? extends POModel> iterable) {

        }

        @Override
        public void deleteAll() {

        }

        @Override
        public <S extends POModel> Optional<S> findOne(Example<S> example) {
            return Optional.empty();
        }

        @Override
        public <S extends POModel> Page<S> findAll(Example<S> example, Pageable pageable) {
            return null;
        }

        @Override
        public <S extends POModel> long count(Example<S> example) {
            return 0;
        }

        @Override
        public <S extends POModel> boolean exists(Example<S> example) {
            return false;
        }
    };


    @StreamListener(Processor.INPUT)
        public void consumerMessage(POModel poModel){
        System.out.println("Message received from Kafka Channel ....");

        poRepository.save(poModel);
        System.out.println(poModel);
    }
}
