# Health and Sync Status

GitOps systems continuously manage:
- desired state
- operational convergence
- and reconciliation behavior

Health and sync visibility help engineers understand whether systems remain operationally consistent.

---

# Sync Status

Sync status represents:
- whether cluster state matches desired Git state

When divergence occurs:
systems become:
- OutOfSync

This helps identify:
- operational drift
- manual mutations
- or failed reconciliation

inside distributed environments.

---

# Health Status

Health status represents:
- operational behavior
- readiness
- and workload correctness

A system may:
- appear synchronized
while still:
- remaining operationally unhealthy

This distinction is critical inside distributed systems.

---

# Operational Correctness

Successful synchronization alone does not guarantee:
- API correctness
- dependency readiness
- or operational convergence

Systems must also become:
- healthy
- dependency-safe
- and operationally valid

during reconciliation.

---

# Reliability Engineering

Health and sync visibility improve:
- operational debugging
- failure detection
- and convergence reasoning

inside Kubernetes platforms.

---

# Platform Perspective

Centralized health visibility improves:
- operational coordination
- platform ownership
- and recovery management

across infrastructure and applications.

---

# Key Insight

Operational consistency requires both:
- synchronized desired state
and:
- valid operational health.
