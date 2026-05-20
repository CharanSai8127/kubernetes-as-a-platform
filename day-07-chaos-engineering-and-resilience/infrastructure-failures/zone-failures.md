# Zone Failures

Zone failures are large-scale infrastructure disruptions affecting:
- entire availability zones.

These failures may involve:
- networking
- power
- storage systems
- or cloud infrastructure instability.

---

# Why Zone Failures Matter

Applications tightly coupled to a single zone may experience:
- workload loss
- storage unavailability
- or traffic disruption.

---

# Stateful System Risks

Stateful workloads are especially vulnerable because:
- storage replication
- quorum
- and synchronization

may become unstable during zone outages.

---

# Mitigation Strategies

Production platforms often use:
- multi-zone deployments
- topology spread constraints
- replicated storage
- and distributed quorum systems

to reduce blast radius.

---

# Operational Reality

Zone recovery may still introduce:
- replication lag
- failover instability
- and delayed convergence.

---

# Key Insight

High availability depends on surviving infrastructure-domain failures safely.
