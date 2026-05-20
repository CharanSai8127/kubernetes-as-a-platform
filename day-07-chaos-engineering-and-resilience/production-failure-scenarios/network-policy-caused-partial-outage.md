# Network Policy Caused Partial Outage

Misconfigured NetworkPolicies may create:
- asymmetric communication failures.

Applications appear:
- partially healthy
while:
- critical dependencies remain unreachable.

---

# Failure Flow

NetworkPolicy updated
→ Backend loses DB connectivity
→ Retries increase
→ Requests timeout
→ Frontend remains partially operational
→ System behaves inconsistently

---

# Why Partial Failures Are Difficult

Distributed systems rarely fail:
- completely.

Instead:
- some traffic paths succeed
- while others silently fail.

---

# Operational Consequences

Partial outages may create:
- intermittent failures
- retry amplification
- and difficult debugging scenarios.

---

# Mitigation Strategies

Operational teams validate:
- network segmentation
- dependency reachability
- and policy behavior carefully.

---

# Key Insight

Distributed systems frequently fail asymmetrically through broken communication paths instead of complete outages.
