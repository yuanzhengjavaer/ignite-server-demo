package com.nomura;

import com.nomura.model.po.Vehicle;
import org.apache.ignite.Ignite;
import org.apache.ignite.IgniteCache;
import org.apache.ignite.IgniteTransactions;
import org.apache.ignite.Ignition;
import org.apache.ignite.configuration.IgniteConfiguration;
import org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi;
import org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder;
import org.apache.ignite.transactions.Transaction;

import java.util.Arrays;
import java.util.Date;
import java.util.Properties;

public class IgniteBaseServer {

    public static void main(String[] args) {
//        Properties props = new Properties();
//        props.setProperty("DIGNITE_SKIP_CONFIGURATION_CONSISTENCY_CHECK","true");
//        System.setProperties();
        Ignite ignite = Ignition.start("ignite-config.xml");
//        IgniteCache<Object, Object> vehicleCache = ignite.getOrCreateCache("vehicles");
//        IgniteTransactions transactions = ignite.transactions();
//        transactions.txStart();
//        vehicleCache.put(1,new Vehicle(null,"BMW", new Date(),1.2));
//        vehicleCache.put(2,new Vehicle(null,"BMW", new Date(),2.2));
//        vehicleCache.put(3,new Vehicle(null,"BMW", new Date(),3.2));
//        Transaction tx1 = transactions.tx();
//        Transaction tx2 = transactions.tx();
//        if(tx1 != tx2){
//            System.out.println("拿不到同一个当前事务处理器");
//        }
//        tx1.rollback();
//        tx1.close();
    }
}
