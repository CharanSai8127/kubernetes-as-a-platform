# Isolation and Blast Radius

Shared Kubernetes platforms require strong isolation boundaries.

Blast radius defines how far a failure is allowed to propagate.

The goal is not preventing all failures.

The goal is containing failures before platform-wide instability occurs.

## Bulkhead Isolation

Bulkhead isolation separates workloads into independent failure domains.

This prevents:
- resource exhaustion
- noisy neighbors
- cascading outages

## Node Pool Isolation

Dedicated node pools isolate:
- operational workloads
- stateful systems
- production services
- tenant workloads

Shared compute becomes a shared failure domain without isolation.

## ResourceQuota

ResourceQuota prevents namespaces from exhausting cluster-wide resources.

Examples:
- CPU limits
- memory limits
- storage limits
- object count restrictions

## LimitRange

LimitRange enforces sane default resource behavior.

This improves:
- scheduling predictability
- workload stability
- resource governance

## Replica Caps

Replica limits prevent runaway autoscaling and uncontrolled workload expansion.

Healthy platforms contain failures locally instead of allowing global amplification.
