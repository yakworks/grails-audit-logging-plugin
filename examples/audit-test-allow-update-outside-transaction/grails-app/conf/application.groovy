grails {
    plugin {
        auditLog {
            verbose = true
            excluded = ['version', 'lastUpdated', 'lastUpdatedBy']
            logFullClassName = true
            failOnError = true
            mask = ['ssn']
            logIds = true
            defaultActor = 'SYS'
            replacementPatterns = ["a.b": ""]
            truncateLength = 1000000
        }
    }
}

// Added by the Audit-Logging plugin:
grails.plugin.auditLog.auditDomainClassName = 'test.AuditTrail'

hibernate_second {
    cache.use_second_level_cache = true
    cache.use_query_cache = false
    provider_class = "net.sf.ehcache.hibernate.EhCacheProvider"
    cache.region.factory_class = 'org.hibernate.cache.ehcache.EhCacheRegionFactory'
}