# Sync Phases and Waves

Distributed systems frequently require dependency-aware operational sequencing.

GitOps controllers such as Argo CD provide:
- sync phases
- and sync waves

to coordinate reconciliation ordering safely.

---

# Why Sequencing Matters

Applications often depend on:
- infrastructure readiness
- database migrations
- certificates
- storage provisioning
- and networking availability

Without sequencing:
- workloads may start too early
- APIs may fail
- or operational correctness may break

during reconciliation.

---

# Sync Waves

Sync waves help define:
- deployment ordering between resources

Resources with lower wave values reconcile earlier than higher-wave resources.

This creates controlled operational sequencing.

---

# Sync Phases

Sync phases allow operational tasks to occur:
- before synchronization
- during synchronization
- or after reconciliation

Examples include:
- migration Jobs
- validation checks
- and cleanup workflows

inside deployment pipelines.

---

# Real Operational Example

A backend application may depend on:
- schema migration completion
before:
- API traffic begins

Sync phases and waves help ensure:
- migrations reconcile first
- operational state becomes valid
- and APIs become correct afterward

---

# Reliability Engineering

Dependency-aware sequencing improves:
- rollout safety
- operational predictability
- and recovery consistency

inside distributed systems.

---

# Key Insight

Operational consistency depends not only on reconciliation itself, but also on reconciling systems in dependency-safe order.
