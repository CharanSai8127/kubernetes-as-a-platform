# API Started Before Migration

A common distributed-system failure occurs when:
- APIs begin serving traffic
before:
- database migration completes successfully.

This creates operational inconsistency between:
- application state
- and data state.

---

# Why This Happens

Applications may:
- start successfully
- pass readiness checks
- and expose endpoints

while still depending on:
- unavailable schemas
- missing tables
- or incomplete migration state

This creates:
- runtime failures
- API instability
- and cascading operational errors.

---

# Operational Correctness

Successful deployment does not automatically guarantee:
- operational readiness
- dependency correctness
- or API validity

inside distributed systems.

Applications must converge toward:
- valid dependency-safe state
before serving production traffic.

---

# GitOps Perspective

GitOps sequencing mechanisms such as:
- sync phases
- and sync waves

help coordinate:
- migration execution
- workload reconciliation
- and operational convergence

predictably.

---

# Reliability Engineering

Reliable systems require:
- migration coordination
- dependency-aware orchestration
- and operational sequencing

during deployments and recovery workflows.

---

# Key Insight

Distributed systems fail when workloads reconcile before operational dependencies converge toward valid state.
